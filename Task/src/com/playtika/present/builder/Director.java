package com.playtika.present.builder;


public class Director {

    private GiftBuilder giftBuilder;

    public void setGiftBuilder(GiftBuilder giftBuilder) {
        this.giftBuilder = giftBuilder;
    }

    public Gift getGift() {

        return giftBuilder.getGift();
    }

    public void constructGift() {
        giftBuilder.createNewGift();
        giftBuilder.buildSweet();
    }
}
