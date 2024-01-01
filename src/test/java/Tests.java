/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Shivang'
 */
import com.mycompany.nymbletask.Activity;
import com.mycompany.nymbletask.Destination;
import com.mycompany.nymbletask.GoldPassenger;
import com.mycompany.nymbletask.PremiumPassenger;
import com.mycompany.nymbletask.StandardPassenger;
import com.mycompany.nymbletask.TravelPackage;
import org.junit.Test;
import static org.junit.Assert.*;

public class Tests {
    @Test
    public void testSignUpForActivity() {
        // Test signing up for an activity by a StandardPassenger
        TravelPackage travelPackage = createTestTravelPackage();
        StandardPassenger standardPassenger = new StandardPassenger("John", 1, 100.0);
        Activity activity = travelPackage.itinerary.get(0).activities.get(0);

        assertTrue(standardPassenger.canSignUp(activity));
        standardPassenger.signUp(activity);

        assertEquals(1, standardPassenger.signedUpActivities.size());
        assertEquals(activity, standardPassenger.signedUpActivities.get(0));
    }

    @Test
    public void testGoldPassengerDiscount() {
        // Test applying a discount for GoldPassenger when signing up for an activity
        TravelPackage travelPackage = createTestTravelPackage();
        GoldPassenger goldPassenger = new GoldPassenger("Alice", 2, 150.0);
        Activity activity = travelPackage.itinerary.get(0).activities.get(0);

        assertTrue(goldPassenger.canSignUp(activity));
        goldPassenger.signUp(activity);

        assertEquals(1, goldPassenger.signedUpActivities.size());
        assertEquals(activity, goldPassenger.signedUpActivities.get(0));
        assertEquals(135.0, goldPassenger.balance, 0.01); // 10% discount applied
    }

    @Test
    public void testPremiumPassengerSignUp() {
        // Test signing up for an activity by a PremiumPassenger (for free)
        TravelPackage travelPackage = createTestTravelPackage();
        PremiumPassenger premiumPassenger = new PremiumPassenger("Bob", 3);
        Activity activity = travelPackage.itinerary.get(0).activities.get(0);

        assertTrue(premiumPassenger.canSignUp(activity));
        premiumPassenger.signUp(activity);

        assertEquals(1, premiumPassenger.signedUpActivities.size());
        assertEquals(activity, premiumPassenger.signedUpActivities.get(0));
        assertEquals(0.0, premiumPassenger.balance, 0.01); // Premium passengers sign up for free
    }

    @Test
    public void testAddPassengerToTravelPackage() {
        // Test adding a passenger to the travel package
        TravelPackage travelPackage = createTestTravelPackage();
        StandardPassenger standardPassenger = new StandardPassenger("John", 1, 100.0);

        travelPackage.addPassenger(standardPassenger);

        assertEquals(1, travelPackage.passengers.size());
        assertEquals(standardPassenger, travelPackage.passengers.get(0));
    }

    @Test
    public void testAddDestinationToTravelPackage() {
        // Test adding a destination to the travel package's itinerary
        TravelPackage travelPackage = createTestTravelPackage();
        Destination newDestination = new Destination("City C");

        travelPackage.addDestination(newDestination);

        assertEquals(3, travelPackage.itinerary.size());
        assertEquals(newDestination, travelPackage.itinerary.get(2));
    }

    // Helper method to create a test travel package with a destination and an activity
    private TravelPackage createTestTravelPackage() {
        Destination destination = new Destination("City A");
        Activity activity = new Activity("Sightseeing", "Visit famous landmarks", 50.0, 10, destination);
        destination.activities.add(activity);

        TravelPackage travelPackage = new TravelPackage("Test Package", 5);
        travelPackage.itinerary.add(destination);

        return travelPackage;
    }
}

