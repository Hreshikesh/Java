package com.xworkz.isarelation.Internal;

public class Eagle extends Bird{
    public Eagle(){
        System.out.println("no arg const of Eagle");
    }
    @Override
    public void fly() {
        System.out.println("Bird is flying in subclass");
    }
    @Override
    public void chirp() {
        System.out.println("Bird chirping in subclass");
    }
    @Override
    public void nest() {
        System.out.println("Bird making a nest in subclass");
    }
    @Override
    public void eat() {
        System.out.println("Bird eating in subclass");
    }
    @Override
    public void sleep() {
        System.out.println("Bird sleeping in subclass");
    }
}
