package com.jason9075.androidttdplayground.car;

/**
 * Created by jason9075 on 2016/3/14.
 */
public class Car {
    private String carName;
    private Motor motor;

    public Car(String carName, Motor motor) {
        this.carName = carName;
        this.motor = motor;
    }

    public String run() {
        return "Speed:" + motor.performSpeed();
    }
}
