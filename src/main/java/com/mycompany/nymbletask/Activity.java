/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.nymbletask;

/**
 *
 * Represents an activity with relevant information such as name, description, cost, capacity, and destination.
 * This class is part of the com.mycompany.nymbletask package.
 *
 * @author Shivang'
 */
public class Activity {
    // Attributes to store information about the activity
    String name;
    String description;
    double cost;
    int capacity;
    Destination destination;

    /**
     * Constructor for the Activity class.
     *
     * @param name        The name of the activity.
     * @param description The description of the activity.
     * @param cost        The cost of the activity.
     * @param capacity    The capacity or maximum number of participants for the activity.
     * @param destination The destination associated with the activity.
     */
    public Activity(String name, String description, double cost, int capacity, Destination destination) {
        // Initializing the attributes with the provided values
        this.name = name;
        this.description = description;
        this.cost = cost;
        this.capacity = capacity;
        this.destination = destination;
    }
}
