package org.example.company;

public class Mitsubishi extends Car{
    public Mitsubishi(int cylinders, String name) {
        super(cylinders, name);
    }

    @Override
    public String startEngine() {
        String className = getClass().getSimpleName();
        return className + " the car's engine is starting";
    }

    @Override
    public String accelerate() {
        String className = getClass().getSimpleName();
        return className + " the car is accelerating";
    }

    @Override
    public String brake() {
        String className = getClass().getSimpleName();
        return className + " the car is braking";
    }

}
