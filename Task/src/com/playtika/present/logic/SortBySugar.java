package com.playtika.present.logic;


import com.playtika.present.entity.Sweets;

import java.util.Comparator;

public class SortBySugar implements Comparator<Sweets> {

    private static final SortBySugar instance = new SortBySugar();

    private SortBySugar() {

    }

    public static SortBySugar getInstance() {
        return instance;
    }

    public int compare(Sweets obj1, Sweets obj2) {

        int sugar1 = obj1.getSugarEmount();
        int sugar2 = obj2.getSugarEmount();

        if (sugar1 > sugar2) {
            return 1;
        } else if (sugar1 < sugar2) {
            return -1;
        } else {
            return 0;
        }
    }
}
