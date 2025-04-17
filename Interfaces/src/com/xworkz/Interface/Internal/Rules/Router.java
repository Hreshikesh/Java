package com.xworkz.Interface.Internal.Rules;

public interface Router {
    void connect();
    void disconnect();
    void reset();

    default void routerInfo() {
        System.out.println("Router information");
    }
}
