package com.kodilla.good.patterns.challenges.flights;

import java.util.List;
import java.util.stream.Collectors;

public class FlightsSercher {
    public static List<Flight> flightsFromCity(City departureCity){
        return FlightsRoutes.getFlightMap().stream()
                .filter(flight -> flight.getDepartureCity() == departureCity)
                .collect(Collectors.toList());
    }
    public static List<Flight> flightsToCity(City arrivalCity) {
        return FlightsRoutes.getFlightMap().stream()
                .filter(flight -> flight.getArrivalCity() == arrivalCity)
                .collect(Collectors.toList());
    }
    public static List<Flight> flightWithTransfer(City transferCity, City departureCity, City arrivalCity){
        return FlightsRoutes.getFlightMap().stream()
                .filter(flight -> flight.getArrivalCity().equals(transferCity))
                .collect(Collectors.toList());
        if ()


    }

}
