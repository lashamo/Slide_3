package com.learn.slide3.country;

public class CountryRunner {

    public static void main(String[] args) {
        City tbilisi = new City("Tbilisi" , 1_500_000);
        Country georgia = new Country("Georgia", tbilisi);
    }
}
