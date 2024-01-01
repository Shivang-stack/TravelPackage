/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.nymbletask;

/**
 * GoldPassenger class represents a passenger with gold status, inheriting from the Passenger class.
 * GoldPassenger has a special discount when signing up for activities.
 *
 * @author Shivang'
 */
public class GoldPassenger extends Passenger {

    /**
     * Constructor for GoldPassenger.
     *
     * @param name            The name of the gold passenger
     * @param passengerNumber The unique passenger number
     * @param balance         The initial balance of the gold passenger
     */
    public GoldPassenger(String name, int passengerNumber, double balance) {
        // Calling the constructor of the superclass (Passenger) with provided parameters
        super(name, passengerNumber, balance);
    }

    /**
     * Checks if a gold passenger can sign up for a specific activity based on the cost and the gold discount.
     *
     * @param activity The activity to check for signup eligibility
     * @return True if the gold passenger can sign up, false otherwise
     */
    //@Override
    public boolean canSignUp(Activity activity) {
        // Gold passenger can sign up if their balance is greater than or equal to 90% of the activity cost
        return balance >= (0.9 * activity.cost);
    }

    /**
     * Signs up a gold passenger for a specific activity if they are eligible.
     * If signed up successfully, deducts the discounted cost from the passenger's balance.
     *
     * @param activity The activity to sign up for
     */
    //@Override
    public void signUp(Activity activity) {
        // Check if the gold passenger can sign up for the activity
        if (canSignUp(activity)) {
            // Deduct 90% of the activity cost from the balance
            balance -= 0.9 * activity.cost;
            // Add the signed-up activity to the list of signed up activities
            signedUpActivities.add(activity);
        }
    }
}
