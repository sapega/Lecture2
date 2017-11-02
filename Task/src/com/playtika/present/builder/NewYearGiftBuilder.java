package com.playtika.present.builder;


import com.playtika.present.entity.Biscuit;

import java.util.Random;

public class NewYearGiftBuilder extends GiftBuilder {

    private int biscuitAmount;
    private int chocolateAmount;
    private int dropsAmount;
    private int marmaladeAmount;

    public NewYearGiftBuilder(String giftName, int biscuitAmount, int chocolateAmount, int dropsAmount, int marmaladeAmount) {
        super(giftName);
        this.biscuitAmount = biscuitAmount;
        this.chocolateAmount = chocolateAmount;
        this.dropsAmount = dropsAmount;
        this.marmaladeAmount = marmaladeAmount;
    }

    public int getBiscuitAmount() {
        return biscuitAmount;
    }

    public void setBiscuitAmount(int biscuitAmount) {
        this.biscuitAmount = biscuitAmount;
    }

    public int getChocolateAmount() {
        return chocolateAmount;
    }

    public void setChocolateAmount(int chocolateAmount) {
        this.chocolateAmount = chocolateAmount;
    }

    public int getDropsAmount() {
        return dropsAmount;
    }

    public void setDropsAmount(int dropsAmount) {
        this.dropsAmount = dropsAmount;
    }

    public int getMarmaladeAmount() {
        return marmaladeAmount;
    }

    public void setMarmaladeAmount(int marmaladeAmount) {
        this.marmaladeAmount = marmaladeAmount;
    }

    @Override
    public void buildSweet() {
        buildBiscuits();
        buildChocolates();
        buildDrops();
        buildMarmalade();

    }

    public void buildBiscuits() {
        Random random = new Random(100);
        for (int i = 0; i < biscuitAmount; i++) {
            gift.addSweet(new Biscuit("Flay", random.nextInt(20),
                    random.nextInt(10), "round", "lemon", random.nextInt(15), "wheat"));
        }
    }

    public void buildChocolates() {
        Random random = new Random(100);
        for (int i = 0; i < chocolateAmount; i++) {
            gift.addSweet(new Biscuit("Kar", random.nextInt(20),
                    random.nextInt(10), "round", "lemon", random.nextInt(15), "milk"));
        }
    }

    public void buildDrops() {
        Random random = new Random(100);
        for (int i = 0; i < dropsAmount; i++) {
            gift.addSweet(new Biscuit("Sik", random.nextInt(20),
                    random.nextInt(10), "round", "lemon", random.nextInt(15), "dark"));
        }
    }

    public void buildMarmalade() {
        Random random = new Random(100);
        for (int i = 0; i < marmaladeAmount; i++) {
            gift.addSweet(new Biscuit("Jack", random.nextInt(20),
                    random.nextInt(10), "round", "lemon", random.nextInt(15), "orange"));
        }
    }
}