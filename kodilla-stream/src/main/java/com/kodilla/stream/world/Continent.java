package com.kodilla.stream.world;

import java.util.List;
import java.util.Objects;

public final class Continent {
    private String continent;
    private List<Country> countries;

    public Continent(String continent, List<Country> countries) {
        this.continent = continent;
        this.countries = countries;
    }

    public String getContinent() {
        return continent;
    }

    public List<Country> getCountries() {
        return countries;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Continent)) return false;
        Continent continent1 = (Continent) o;
        return Objects.equals(getContinent(), continent1.getContinent());
    }

    @Override
    public int hashCode() {

        return Objects.hash(getContinent());
    }

    @Override
    public String toString() {
        return "Continent{" +
                "continent='" + continent + '\'' +
                '}';
    }
}