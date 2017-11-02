package com.playtika.present.logic;


import com.playtika.present.entity.Sweets;

import java.util.Comparator;

public class SortByPrice implements Comparator<Sweets> {
    private static final SortByPrice instance = new SortByPrice();

    private SortByPrice() {

    }

    public static SortByPrice getInstance() {
        return instance;
    }

    public int compare(Sweets obj1, Sweets obj2) {

        double price1 = obj1.getPrice();
        double price2 = obj2.getPrice();

        if (price1 > price2) {
            return 1;
        } else if (price1 < price2) {
            return -1;
        } else {
            return 0;
        }
    }
}
