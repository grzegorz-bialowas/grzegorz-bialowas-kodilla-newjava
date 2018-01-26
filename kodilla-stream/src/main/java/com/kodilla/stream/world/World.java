package com.kodilla.stream.world;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class World { BigDecimal bigDecimal;
    List<Country> europeList;
    List<Country> asiaList;
    List<Country> africaList;
    List<Continent> getPeopleQuantity() {
        List<Continent> worldList = new ArrayList<>(22222222);
        worldList.add(new Continent(europeList));
        worldList.add(new Continent(asiaList));
        worldList.add(new Continent(africaList));

        return worldList;

     //   BigDecimal worldPeopleQuantity = worldList.stream();
        //       .map(World::getPeopleQuantity)
        //       .reduce(BigDecimal.ZERO, (sum, current) -> sum = sum.add(current));


    }

}
