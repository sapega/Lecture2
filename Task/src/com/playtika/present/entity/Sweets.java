package com.playtika.present.entity;


public abstract class Sweets {
    private String name;
    private double price;
    private int weight;
    private String form;
    private String taste;
    private int sugarEmount;

    public Sweets(String name, double price, int weight, String form, String taste, int sugarEmount) {
        this.name = name;
        this.price = price;
        this.weight = weight;
        this.form = form;
        this.taste = taste;
        this.sugarEmount = sugarEmount;
    }

    public abstract void makeSweet();


    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int getWeight() {
        return weight;
    }

    public String getForm() {
        return form;
    }

    public String getTaste() {
        return taste;
    }

    public int getSugarEmount() {
        return sugarEmount;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void setForm(String form) {
        this.form = form;
    }

    public void setTaste(String taste) {
        this.taste = taste;
    }

    public void setSugarEmount(int sugarEmount) {
        this.sugarEmount = sugarEmount;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Sweets sweets = (Sweets) o;

        if (Double.compare(sweets.price, price) != 0) return false;
        if (weight != sweets.weight) return false;
        if (sugarEmount != sweets.sugarEmount) return false;
        if (!name.equals(sweets.name)) return false;
        if (!form.equals(sweets.form)) return false;
        return taste.equals(sweets.taste);

    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = name.hashCode();
        temp = Double.doubleToLongBits(price);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        result = 31 * result + weight;
        result = 31 * result + form.hashCode();
        result = 31 * result + taste.hashCode();
        result = 31 * result + sugarEmount;
        return result;
    }

    @Override
    public String toString() {
        return "" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", weight=" + weight +
                ", form='" + form + '\'' +
                ", taste='" + taste + '\'' +
                ", sugarEmount=" + sugarEmount +
                "";
    }
}

