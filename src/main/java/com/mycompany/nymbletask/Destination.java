/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.nymbletask;

/**
 * Destination class represents a travel destination with a name and a list of activities.
 * Each destination can have multiple activities associated with it.
 *
 * @author Shivang'
 */
import java.util.ArrayList;
import java.util.List;

public class Destination {
    // Name of the destination
    String name;

    // List of activities associated with the destination
    public List<Activity> activities;

    /**
     * Constructor to initialize a Destination object with a given name.
     * It also initializes the list of activities as an empty ArrayList.
     *
     * @param name The name of the destination
     */
    public Destination(String name) {
        this.name = name;
        this.activities = new ArrayList<>(); // Initializing the activities list as an ArrayList
    }
}
