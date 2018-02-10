package com.kodilla.exception.test;

import java.util.HashMap;
import java.util.Map;

public class FlightFinder {
    public boolean findFlight(Flight flight) throws RouteNotFoundException{
         Map<String, Boolean> flightMap = new HashMap<>();
         flightMap.put("Opole", false);
         flightMap.put("Warsaw", true);
         flightMap.put("Krakow", true);
         flightMap.put("Gdansk", true);
         flightMap.put("Turawa", false);
        String arrivalAirport = flight.getArrivalAirport();
        Boolean checkFlight  = flightMap.get(arrivalAirport);
        if (checkFlight !=null) {
            return checkFlight;
        } else {
            throw new RouteNotFoundException("Your airport is not on flight schedule. Choose another airport, please.");
        }
    }
    public static void main(String args[]) {
        FlightFinder flightFinder = new FlightFinder();
        try {
            flightFinder.findFlight(new Flight("Opole", "Krakow"));
        } catch (RouteNotFoundException e) {
            System.out.println("Error. Wrong airport." + e);
        }
    }
}
