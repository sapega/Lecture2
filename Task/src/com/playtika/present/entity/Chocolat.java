package com.playtika.present.entity;


public class Chocolat extends Sweets{
    private String chocolateType;

    public Chocolat(String name, double price, int weight, String form, String taste, int sugarEmount, String chocolateType) {
        super(name, price, weight, form, taste, sugarEmount);
        this.chocolateType = chocolateType;
    }

    public String getChocolateType() {
        return chocolateType;
    }

    public void setChocolateType(String chocolateType) {
        this.chocolateType = chocolateType;
    }

    @Override
    public void makeSweet() {
        System.out.println("You have used Chocolate method");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        Chocolat chocolat = (Chocolat) o;

        return chocolateType.equals(chocolat.chocolateType);

    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + chocolateType.hashCode();
        return result;
    }

    @Override
    public String toString() {
        return " Chocolat " +super.toString()+
                "chocolateType='" + chocolateType + '\'' +
                "";
    }
}

