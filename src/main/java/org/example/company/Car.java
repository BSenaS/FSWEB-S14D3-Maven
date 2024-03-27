package org.example.company;

import java.util.Objects;
//Test
public class Car {
    private boolean engine = true;
    private int cylinders;
    private String name;
    private int wheels = 4;

    public int getCylinders() {
        return cylinders;
    }

    public String getName() {
        return name;
    }

    public Car(int cylinders, String name) {
        this.cylinders = cylinders;
        this.name = name;

    }

    @Override
    public String toString() {
        return "Car{" +
                "engine=" + engine +
                ", cylinders=" + cylinders +
                ", name='" + name + '\'' +
                ", wheels=" + wheels +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return cylinders == car.cylinders && Objects.equals(name, car.name);
    }
    public String startEngine(){
        System.out.println(getClass().getSimpleName());
        return "the car's engine is starting";
    }
    public String accelerate(){
        System.out.println(getClass().getSimpleName());
        return "the car is accelerating";

    }
    public String brake(){

        System.out.println(getClass().getSimpleName());
        return "the car is braking";
    }

}