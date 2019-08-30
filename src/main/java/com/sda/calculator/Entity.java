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
        System.out.println(" Error: city can't be empty/null");

    }

    @Override
    public String toString() {
        return " This city is: " + city +
    " and the amount is: "+ amountReceived() + "\n";
    }

     public abstract double amountReceived();
    // am facut-o abstracta astfel am modificat si clasa sa fie abstracta.
   // o metoda adstracta este o implementare in clasa abstracta, din care se poate mostenii/
    // destinate sa fie suprascrise(override)


}



