package com.kodilla.stream.world;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public final class Continent {
    BigDecimal bigDecimal;
    List<Country> europeList;
    BigDecimal Poland = new BigDecimal(20000000);
    BigDecimal Russia = new BigDecimal(20000000);
    BigDecimal Spain = new BigDecimal(20000000);
    BigDecimal England = new BigDecimal(20000000);
    BigDecimal France = new BigDecimal(20000000);
    BigDecimal China = new BigDecimal(80000000);
    BigDecimal Japan = new BigDecimal(20000000);
    BigDecimal Indie = new BigDecimal(50000000);
    BigDecimal Egypt = new BigDecimal(50000000);
    BigDecimal Libya = new BigDecimal(50000000);
    BigDecimal Nigeria = new BigDecimal(50000000);

    public Continent(List<Country> countryList) {
    }

    BigDecimal EuropeQuantity() {
            List<Country> europeList = new ArrayList<>(100000000);
            europeList.add(new Country(Poland));
            europeList.add(new Country(Russia));
            europeList.add(new Country(Spain));
            europeList.add(new Country(England));
            europeList.add(new Country(France));
            BigDecimal totalEurope = BigDecimal.ZERO;
                for (Country europe : europeList) {
                    totalEurope = totalEurope.add(europe.getPeopleQuantity());
                }
                return totalEurope;
        }
        BigDecimal AsiaQuantity() {
            List<Country> asiaList = new ArrayList<>(1500000000);
            asiaList.add(new Country(China));
            asiaList.add(new Country(Japan));
            asiaList.add(new Country(Indie));
            BigDecimal totalAsia = BigDecimal.ZERO;
                for (Country asia : asiaList) {
                    totalAsia = totalAsia.add(asia.getPeopleQuantity());
                }
                return totalAsia;
            }
    private List<Country> asiaList() {
        return asiaList();
    }


    BigDecimal AfricaQuantity() {
            List<Country> africaList = new ArrayList<>(150000000);
            africaList.add(new Country(Egypt));
            africaList.add(new Country(Libya));
            africaList.add(new Country(Nigeria));
            BigDecimal totalAfrica = BigDecimal.ZERO;
                for (Country africa : africaList) {
                    totalAfrica = totalAfrica.add(africa.getPeopleQuantity());
                }
                return totalAfrica;
        }
}