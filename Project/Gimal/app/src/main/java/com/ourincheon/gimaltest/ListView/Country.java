package com.ourincheon.gimaltest.ListView;

/**
 * Created by mijeong on 2017. 12. 21..
 */

public class Country {
    String name;

    public Country(String name, String capital, int population, int imageID) {
        this.name = name;
        this.capital = capital;
        this.population = population;
        this.imageID = imageID;
    }

    String capital;
    int population;
    int imageID;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCapital() {
        return capital;
    }

    public void setCapital(String capital) {
        this.capital = capital;
    }

    public int getPopulation() {
        return population;
    }

    public void setPopulation(int population) {
        this.population = population;
    }

    public int getImageID() {
        return imageID;
    }

    public void setImageID(int imageID) {
        this.imageID = imageID;
    }
}
