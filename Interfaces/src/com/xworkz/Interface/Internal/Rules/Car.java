package com.xworkz.Interface.Internal.Rules;

public interface Car {
    void drive();
    void stop();
    void speedDrive();

    default void carInfo() {
        System.out.println("Car information");
    }
}
