/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.nymbletask;

/**
 * TravelPackage class represents a travel package with a name, passenger capacity, itinerary, and list of passengers.
 * It includes methods to add destinations, add passengers, and print details such as itinerary, passenger list,
 * passenger details, and available activities.
 * 
 * Author: Shivang'
 */
import java.util.ArrayList;
import java.util.List;

public class TravelPackage {
    // Name of the travel package
    String name;

    // Passenger capacity of the travel package
    public int passengerCapacity;

    // List of destinations in the itinerary
    public List<Destination> itinerary;

    // List of passengers enrolled in the travel package
    public List<Passenger> passengers;

    /**
     * Constructor for creating a TravelPackage object.
     *
     * @param name              The name of the travel package
     * @param passengerCapacity The passenger capacity of the travel package
     */
    public TravelPackage(String name, int passengerCapacity) {
        this.name = name;
        this.passengerCapacity = passengerCapacity;
        this.itinerary = new ArrayList<>(); // Initializing the itinerary list as an ArrayList
        this.passengers = new ArrayList<>(); // Initializing the passengers list as an ArrayList
    }

    /**
     * Adds a destination to the travel package's itinerary.
     *
     * @param destination The destination to add
     */
    public void addDestination(Destination destination) {
        itinerary.add(destination);
    }

    /**
     * Adds a passenger to the travel package if the capacity is not reached.
     *
     * @param passenger The passenger to add
     */
    public void addPassenger(Passenger passenger) {
        if (passengers.size() < passengerCapacity) {
            passengers.add(passenger);
        } else {
            System.out.println("Cannot add more passengers. Capacity reached.");
        }
    }

    /**
     * Prints the itinerary of the travel package, including details of destinations and activities.
     */
    public void printItinerary() {
        System.out.println("Travel Package: " + name);
        for (Destination destination : itinerary) {
            System.out.println("Destination: " + destination.name);
            for (Activity activity : destination.activities) {
                System.out.println("Activity: " + activity.name +
                        ", Cost: " + activity.cost +
                        ", Capacity: " + activity.capacity +
                        ", Description: " + activity.description);
            }
        }
    }

    /**
     * Prints the list of passengers enrolled in the travel package.
     */
    public void printPassengerList() {
        System.out.println("Passenger List for Travel Package: " + name);
        System.out.println("Capacity: " + passengerCapacity);
        System.out.println("Number of passengers enrolled: " + passengers.size());
        for (Passenger passenger : passengers) {
            System.out.println("Passenger Name: " + passenger.name +
                    ", Passenger Number: " + passenger.passengerNumber);
        }
    }

    /**
     * Prints details of a specific passenger, including their balance and signed-up activities.
     *
     * @param passenger The passenger whose details to print
     */
    public void printPassengerDetails(Passenger passenger) {
        System.out.println("Passenger Details:");
        System.out.println("Name: " + passenger.name);
        System.out.println("Passenger Number: " + passenger.passengerNumber);
        if (passenger instanceof StandardPassenger || passenger instanceof GoldPassenger) {
            System.out.println("Balance: " + passenger.balance);
        }
        System.out.println("Signed Up Activities:");
        for (Activity activity : passenger.signedUpActivities) {
            System.out.println("Activity: " + activity.name +
                    ", Destination: " + activity.destination.name +
                    ", Price: " + (passenger instanceof GoldPassenger ? 0.9 * activity.cost : activity.cost));
        }
    }

    /**
     * Prints the available spaces for each activity in the travel package.
     */
    public void printAvailableActivities() {
        System.out.println("Available Activities:");
        for (Destination destination : itinerary) {
            for (Activity activity : destination.activities) {
                int signedUpCount = 0;

                for (Passenger passenger : passengers) {
                    for (Activity signedUpActivity : passenger.signedUpActivities) {
                        if (signedUpActivity.equals(activity)) {
                            signedUpCount++;
                        }
                    }
                }

                int availableSpaces = activity.capacity - signedUpCount;

                System.out.println("Activity: " + activity.name +
                        ", Destination: " + destination.name +
                        ", Available Spaces: " + availableSpaces);
            }
        }
    }
}
