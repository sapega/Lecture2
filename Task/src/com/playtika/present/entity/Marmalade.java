package com.playtika.present.entity;


public class Marmalade extends Sweets{

    private String juiceType;

    public Marmalade(String name, double price, int weight, String form, String taste, int sugarEmount, String juiceType) {
        super(name, price, weight, form, taste, sugarEmount);
        this.juiceType = juiceType;
    }

    public String getJuiceType() {
        return juiceType;
    }

    public void setJuiceType(String juiceType) {
        this.juiceType = juiceType;
    }

    @Override
    public void makeSweet() {
        System.out.println("You have used Marmalade method");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        Marmalade marmalade = (Marmalade) o;

        return juiceType.equals(marmalade.juiceType);

    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + juiceType.hashCode();
        return result;
    }

    @Override
    public String toString() {
        return " Marmalade " +super.toString()+
                "juiceType='" + juiceType + '\'' +
                "";
    }
}
