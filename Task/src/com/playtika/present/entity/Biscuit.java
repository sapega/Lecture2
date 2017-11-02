package com.playtika.present.entity;


public class Biscuit extends Sweets {
    private String flour;

    public Biscuit(String name, double price, int weight, String form, String taste, int sugarEmount, String flour) {
        super(name, price, weight, form, taste, sugarEmount);
        this.flour = flour;
    }

    public String getFlour() {
        return flour;
    }

    public void setFlour(String flour) {
        this.flour = flour;
    }

    @Override
    public void makeSweet() {
        System.out.println("You have used Biscuit method");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        Biscuit biscuit = (Biscuit) o;

        return flour.equals(biscuit.flour);

    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + flour.hashCode();
        return result;
    }


    @Override
    public String toString() {
        return " Biscuit " +super.toString()+
                "flour='" + flour + '\'' +
                "";
    }
}
