package com.sda.calculator;

import java.util.ArrayList;
import java.util.List;

public abstract class Entity {
    private String city;

    public String getCity() {
        return city;
    }

    public Entity() {
    }

    public Entity(String city) {
        if (city != null && !city.isEmpty()){
            this.city = city;
        } else {
            throw new InvalidDateTipeExceptions();}
        System.out.println(" Error city can't be empty");

    }

    @Override
    public String toString() {
        return "Entity{" +
                "city='" + city + '\'' +
                '}';
    }

     public abstract double amountReceived();


}



