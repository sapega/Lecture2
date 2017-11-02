package com.playtika.present.main;


import com.playtika.present.builder.Director;
import com.playtika.present.builder.Gift;
import com.playtika.present.builder.GiftBuilder;
import com.playtika.present.builder.NewYearGiftBuilder;
import com.playtika.present.entity.*;

public class Runner {
    public static void main(String[] args) {


        Director director = new Director();
        GiftBuilder newYearGiftBuilder = new NewYearGiftBuilder(
                "New Year Gift", 10, 15, 20,40);
      director.setGiftBuilder(newYearGiftBuilder);
        director.constructGift();
        Gift gift = director.getGift();
        System.out.println(gift);

        gift.sortSweetsByPrice();

        System.out.println("Gift with sweets sorted by price: " + gift);

        gift.sortSweetsBySugar();
        System.out.println("Gift with sweets sorted by sugar: " + gift);



        Sweets biscuitSweet = new Biscuit("Flaky", 10, 10, "round", "lemon", 5, "wheat");
        Sweets chocolateSWeet = new Chocolat("Kar", 4, 5, "flat", "strawberry", 5, "milk");
        Sweets dropsSweet = new Drops("Sik", 5, 10, "round", "mint", 4, "dark");
        Sweets marmaladeSweet = new Marmalade("Jack", 5, 6, "flat", "lemon", 5, "lemon");

        biscuitSweet.makeSweet();
        chocolateSWeet.makeSweet();
        dropsSweet.makeSweet();
        marmaladeSweet.makeSweet();
    }
}
