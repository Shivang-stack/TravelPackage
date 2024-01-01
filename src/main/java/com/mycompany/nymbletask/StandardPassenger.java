/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.nymbletask;

/**
 * StandardPassenger class represents a standard passenger, inheriting from the Passenger class.
 * StandardPassenger has standard behavior for signing up for activities based on their balance.
 *
 * @author Shivang'
 */
public class StandardPassenger extends Passenger {

    /**
     * Constructor for StandardPassenger.
     *
     * @param name            The name of the standard passenger
     * @param passengerNumber The unique passenger number
     * @param balance         The initial balance of the standard passenger
     */
    public StandardPassenger(String name, int passengerNumber, double balance) {
        // Calling the constructor of the superclass (Passenger) with provided parameters
        super(name, passengerNumber, balance);
    }

    /**
     * Checks if a standard passenger can sign up for a specific activity based on their balance and the activity cost.
     *
     * @param activity The activity to check for signup eligibility
     * @return True if the standard passenger can sign up, false otherwise
     */
    //@Override
    public boolean canSignUp(Activity activity) {
        // Standard passenger can sign up if their balance is greater than or equal to the activity cost
        return balance >= activity.cost;
    }

    /**
     * Signs up a standard passenger for a specific activity if they are eligible.
     * If signed up successfully, deducts the activity cost from the passenger's balance.
     *
     * @param activity The activity to sign up for
     */
    //@Override
    public void signUp(Activity activity) {
        // Check if the standard passenger can sign up for the activity
        if (canSignUp(activity)) {
            // Deduct the activity cost from the balance
            balance -= activity.cost;
            // Add the signed-up activity to the list of signed up activities
            signedUpActivities.add(activity);
        }
    }
}
