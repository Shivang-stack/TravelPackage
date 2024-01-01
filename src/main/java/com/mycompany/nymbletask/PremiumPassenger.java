/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.nymbletask;

/**
 * PremiumPassenger class represents a premium passenger, inheriting from the Passenger class.
 * PremiumPassenger has special characteristics such as free sign-ups for any activity.
 *
 * @author Shivang'
 */
public class PremiumPassenger extends Passenger {

    /**
     * Constructor for PremiumPassenger.
     *
     * @param name            The name of the premium passenger
     * @param passengerNumber The unique passenger number
     */
    public PremiumPassenger(String name, int passengerNumber) {
        // Calling the constructor of the superclass (Passenger) with provided parameters and initializing balance to 0
        super(name, passengerNumber, 0);
    }

    /**
     * Checks if a premium passenger can sign up for any activity.
     *
     * @param activity The activity to check for signup eligibility (ignored in this case)
     * @return Always returns true, as premium passengers can sign up for any activity for free
     */
    //@Override
    public boolean canSignUp(Activity activity) {
        // Premium passengers can sign up for any activity for free
        return true;
    }

    /**
     * Signs up a premium passenger for a specific activity (or any activity).
     * Adds the activity to the list of signed-up activities.
     *
     * @param activity The activity to sign up for (ignored in this case)
     */
    //@Override
    public void signUp(Activity activity) {
        // Premium passengers can sign up for any activity for free, so add the activity to the list
        signedUpActivities.add(activity);
    }
}
