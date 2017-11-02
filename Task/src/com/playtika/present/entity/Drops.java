package com.playtika.present.entity;


public class Drops extends Sweets{


    private String transparent;

    public Drops(String name, double price, int weight, String form, String taste, int sugarEmount, String transparent) {
        super(name, price, weight, form, taste, sugarEmount);
        this.transparent = transparent;
    }

    public String getTransparent() {
        return transparent;
    }

    public void setTransparent(String transparent) {
        this.transparent = transparent;
    }

    @Override
    public void makeSweet() {
        System.out.println("You have used Drops method");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        Drops drops = (Drops) o;

        return transparent.equals(drops.transparent);

    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + transparent.hashCode();
        return result;
    }

    @Override
    public String toString() {
        return " Drops " +super.toString()+
                "transparent='" + transparent + '\'' +
                "";
    }
}
