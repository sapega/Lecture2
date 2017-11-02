package com.playtika.present.builder;


import com.playtika.present.entity.Sweets;
import com.playtika.present.logic.SortByPrice;
import com.playtika.present.logic.SortBySugar;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Gift {
    private String giftName;
    private List<Sweets> sweets = new ArrayList<Sweets>();

    public int getSweetAmount() {
        return sweets.size();
    }

    public void addSweet(Sweets sweet) {
        sweets.add(sweet);
    }

    public String getGiftName() {
        return giftName;
    }

    public void setGiftName(String giftName) {
        this.giftName = giftName;
    }

    public List<Sweets> getSweet() {
        return sweets;
    }

    public void setSweet(List<Sweets> sweet) {
        this.sweets = sweet;
    }

    @Override
    public String toString() {
        return "Gift [giftName=" + giftName + ", sweet=" + sweets + "]";
    }

    public void sortSweetsByPrice() {
        Collections.sort(sweets, SortByPrice.getInstance());
    }

    public void sortSweetsBySugar() {
        Collections.sort(sweets, SortBySugar.getInstance());
    }
}

