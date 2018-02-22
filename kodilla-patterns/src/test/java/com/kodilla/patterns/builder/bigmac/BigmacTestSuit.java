package com.kodilla.patterns.builder.bigmac;

import org.junit.Assert;
import org.junit.Test;

public class BigmacTestSuit {
    @Test
    public void testBigmacNew() {
        //Given
        Bigmac bigmac = new Bigmac.BigmacBuilder()
                .burgers(3)
                .roll("flat")
                .sauce("hot spicy")
                .ingriedent("onion")
                .ingriedent("pepper")
                .ingriedent("tomato")
                .ingriedent("ham")
                .build();
        System.out.println(bigmac);
        //When
        int howmanyIngridents = bigmac.getIngredients().size();
        String rollCheck = bigmac.getRoll();
        String sauceCheck = bigmac.getSauce();
        int burgersCheck = bigmac.getBurgers();
        //Then
        Assert.assertEquals(4, howmanyIngridents);
        Assert.assertEquals("flat", rollCheck);
        Assert.assertEquals("hot spicy", sauceCheck);
        Assert.assertEquals(3, burgersCheck);
    }
}
