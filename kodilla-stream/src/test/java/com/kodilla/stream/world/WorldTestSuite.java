package com.kodilla.stream.world;
import org.junit.Assert;
import org.junit.Test;
import java.math.BigDecimal;
import java.util.Arrays;
public class WorldTestSuite {
    @Test
    public void testGetPeopleQuantity(){
        //Given
        Continent europe = new Continent("europe", Arrays.asList(
                new Country("Poland", new BigDecimal(34455500)),
                new Country("France", new BigDecimal(13344444)),
                new Country("Spain", new BigDecimal(103434444)),
                new Country("Russia", new BigDecimal(10746764)),
                new Country("England", new BigDecimal(10034343))));
        Continent asia = new Continent( "asia", Arrays.asList(
                new Country("China", new BigDecimal(10433222)),
                new Country("Japan", new BigDecimal(54434343)),
                new Country("Laos", new BigDecimal(35532357))));
        Continent africa = new Continent("africa", Arrays.asList(
                new Country("Egypt", new BigDecimal(58877868)),
                new Country("Libia", new BigDecimal(1004353)),
                new Country("Camerun", new BigDecimal(1004355))));
        World bigWorld = new World(Arrays.asList(asia,europe, africa));
        //When
        BigDecimal peopleInTheWorld = bigWorld.getPeopleQuantity();
        //Then
        BigDecimal checkPeopleQuantity = new BigDecimal(333301993);
        Assert.assertEquals(checkPeopleQuantity,peopleInTheWorld);
    }
}
