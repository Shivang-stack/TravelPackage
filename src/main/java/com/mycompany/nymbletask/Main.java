package com.mycompany.nymbletask;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


/**
 *
 * @author Shivang'
 */

public class Main {
    public static void main(String[] args) {
        // Create destinations
        Destination destination1 = new Destination("City A");
        Destination destination2 = new Destination("City B");

        // Create activities
        Activity activity1 = new Activity("Sightseeing", "Visit famous landmarks", 50.0, 10, destination1);
        Activity activity2 = new Activity("Hiking", "Explore nature trails", 30.0, 15, destination1);
        Activity activity3 = new Activity("Museum Tour", "Learn about local history", 20.0, 12, destination2);

        // Add activities to destinations
        destination1.activities.add(activity1);
        destination1.activities.add(activity2);
        destination2.activities.add(activity3);

        // Create passengers
        StandardPassenger standardPassenger = new StandardPassenger("John", 1, 100.0);
        GoldPassenger goldPassenger = new GoldPassenger("Alice", 2, 150.0);
        PremiumPassenger premiumPassenger = new PremiumPassenger("Bob", 3);

        // Create a travel package
        TravelPackage travelPackage = new TravelPackage("Adventure Package", 5);
        travelPackage.addDestination(destination1);
        travelPackage.addDestination(destination2);

        // Add passengers to the travel package
        travelPackage.addPassenger(standardPassenger);
        travelPackage.addPassenger(goldPassenger);
        travelPackage.addPassenger(premiumPassenger);

        // Sign up passengers for activities
        standardPassenger.signUp(activity1);
        goldPassenger.signUp(activity2);
        premiumPassenger.signUp(activity3);

        // Print travel package itinerary
        travelPackage.printItinerary();

        // Print passenger list
        travelPackage.printPassengerList();

        // Print individual passenger details
        travelPackage.printPassengerDetails(standardPassenger);

        // Print available activities
        travelPackage.printAvailableActivities();
    }
}

