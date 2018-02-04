package com.kodilla.exception.test;

import java.util.HashMap;
import java.util.Map;

public class FlightFinder {
    public void findFlight(Flight flight) throws RouteNotFoundException{
         Map<String, Boolean> flightMap = new HashMap<>();
         flightMap.put("Opole", false);
         flightMap.put("Warsaw", true);
         flightMap.put("Krakow", true);
         flightMap.put("Gdansk", true);
         flightMap.put("Turawa", false);
        String destination = flight.getArrivalAirport();
        String departure = flight.getDepartureAirport();
        if (flightMap.containsKey(departure) && flightMap.containsValue(destination) == true) {
            System.out.println("Your airport is on flight schedule.");
        } else {
            throw new RouteNotFoundException("Your airport is not on flight schedule. Choose another airport, please.");
        }

    }
    public static void main(String args[]) {
        FlightFinder flightFinder = new FlightFinder();
        try {
            flightFinder.findFlight(new Flight("Warsaw", "Krakow"));
        } catch (RouteNotFoundException e) {
            System.out.println("Your airport is not on flight schedule" + e);
        }
    }
}
