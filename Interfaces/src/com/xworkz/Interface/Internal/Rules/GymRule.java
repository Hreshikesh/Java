package com.xworkz.Interface.Internal.Rules;

public interface GymRule {
    void timings();
    void diet();
    void weigth();

    default void gymInfo() {
        System.out.println("Gym information");
    }

}
