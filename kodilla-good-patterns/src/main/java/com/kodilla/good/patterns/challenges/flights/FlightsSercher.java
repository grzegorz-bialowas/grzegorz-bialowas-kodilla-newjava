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
    public static List<Flight> flightDirectly(City departureCity, City arrivalCity){
        return FlightsRoutes.getFlightMap().stream()
                .filter(flight -> flight.getDepartureCity().equals(departureCity) && flight.getArrivalCity().equals(arrivalCity))
                .collect(Collectors.toList());
    }
    public static List<City> flightWithTransfer(City departureCity, City arrivalCity) {
                List<Flight> transferFly = FlightsSercher.flightsFromCity(departureCity);
                List<City> aaa = transferFly.stream()
                        .map(flight -> flight.getArrivalCity())
                        .collect(Collectors.toList());
                List<Flight> zzzz = FlightsSercher.flightsToCity(arrivalCity);
                return zzzz.stream()
                        .filter(flight -> aaa.contains(flight.getDepartureCity()))
                        .map(flight -> flight.getDepartureCity())
                        .collect(Collectors.toList());
    }
}
