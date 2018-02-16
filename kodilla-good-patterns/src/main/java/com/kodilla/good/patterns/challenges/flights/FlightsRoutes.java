package com.kodilla.good.patterns.challenges.flights;

import java.util.HashSet;
import java.util.Set;

public class FlightsRoutes {
    private static Set<Flight> flightMap = new HashSet<>();
    public static Set<Flight> getFlightMap() {
        flightMap.add(new Flight(City.WARSAW, City.GDANSK));
        flightMap.add(new Flight(City.WARSAW, City.KRAKOW));
        flightMap.add(new Flight(City.WARSAW, City.POZNAN));
        flightMap.add(new Flight(City.WARSAW, City.WROCLAW));
        flightMap.add(new Flight(City.GDANSK, City.WROCLAW));
        flightMap.add(new Flight(City.GDANSK, City.POZNAN));
        flightMap.add(new Flight(City.GDANSK, City.KRAKOW));
        flightMap.add(new Flight(City.GDANSK, City.WARSAW));
        flightMap.add(new Flight(City.KRAKOW, City.WARSAW));
        flightMap.add(new Flight(City.KRAKOW, City.POZNAN));
        flightMap.add(new Flight(City.KRAKOW, City.WROCLAW));
        flightMap.add(new Flight(City.POZNAN, City.WROCLAW));
        flightMap.add(new Flight(City.POZNAN, City.WARSAW));
        flightMap.add(new Flight(City.WROCLAW, City.WARSAW));
        flightMap.add(new Flight(City.WROCLAW, City.KRAKOW));
        flightMap.add(new Flight(City.WROCLAW, City.POZNAN));
        return flightMap;
    }
}
