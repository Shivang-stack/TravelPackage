/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.nymbletask;

/**
 * Passenger class represents a general passenger with a name, a unique passenger number, a balance,
 * and a list of signed-up activities.
 *
 * @author Shivang'
 */
import java.util.ArrayList;
import java.util.List;

public class Passenger {
    // Name of the passenger
    String name;

    // Unique passenger number
    int passengerNumber;

    // Balance of the passenger
    public double balance;

    // List of activities the passenger has signed up for
    public List<Activity> signedUpActivities;

    /**
     * Constructor for creating a Passenger object.
     *
     * @param name            The name of the passenger
     * @param passengerNumber The unique passenger number
     * @param balance         The initial balance of the passenger
     */
    public Passenger(String name, int passengerNumber, double balance) {
        this.name = name;
        this.passengerNumber = passengerNumber;
        this.balance = balance;
        this.signedUpActivities = new ArrayList<>(); // Initializing the signed-up activities list as an ArrayList
    }
}
