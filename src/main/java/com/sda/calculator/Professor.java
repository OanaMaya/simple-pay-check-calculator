package com.sda.calculator;

public class Professor extends Entity {
    private double salary;

    public Professor() {
    }

    public Professor(String city) {
        super(city);
    }

    public Professor(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Professor{" + super.getCity() +
                "salary=" + salary +
                '}';
    }

    public Professor(String city, double salary) {
        super(city);
        if (salary > 0) {
            this.salary = salary;
        } else {
            throw new InvalidDateTipeExceptions();
        }
        System.out.println(" Error: Salary must be > 0");
    }

    public double amountReceived() {
        return this.salary;
    }

}


