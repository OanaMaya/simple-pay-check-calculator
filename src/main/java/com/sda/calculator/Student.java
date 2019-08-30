package com.sda.calculator;

public class Student extends Entity {
    private double scholarship;

    public Student() {
    }

    public Student(String city) {
        super(city);
    }

    public Student(double scholarship) {
        this.scholarship = scholarship;
    }

    @Override
    public String toString() {
        return "Student " + super.getCity() +
                " scholarship = " + scholarship + " \n";
    }

    public Student(String city, double scholarship) {
        super(city);
        if (scholarship > 0) {
            this.scholarship = scholarship;
        } else {
            throw new InvalidDateTipeExceptions();
        }
        System.out.println("Error: scholarship must be greater than 0");

    }


    public double amountReceived() {
        return this.scholarship;
    }

}

