package com.ourincheon.individualstudyandroid.TestPrepare.WorldTime;

/**
 * Created by mijeong on 2017. 12. 21..
 */

public class Country {
    String name;
    String time;

    public Country(String name, String time) {
        this.name = name;
        this.time = time;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }
}
