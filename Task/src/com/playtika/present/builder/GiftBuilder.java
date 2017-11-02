package com.playtika.present.builder;


public abstract class GiftBuilder {
    protected Gift gift;
    protected String giftName;

    public Gift getGift() {
        return gift;
    }

    public void createNewGift() {
        gift = new Gift();
        gift.setGiftName(getGiftName());
    }

    public abstract void buildSweet();

    public GiftBuilder(String giftName) {
        this.giftName = giftName;
    }

    public String getGiftName() {
        return giftName;
    }

    public void setGiftName(String giftName) {
        this.giftName = giftName;
    }
}

