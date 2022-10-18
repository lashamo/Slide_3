package com.learn.slide3.country;

public class Country {

    public String name;

    public City capital;

    public Country() {}

    public Country(String name, City capital) {
        this.name = name;
        this.capital = capital;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public City getCapital() {
        return capital;
    }

    public void setCapital(City capital) {
        this.capital = capital;
    }
}
