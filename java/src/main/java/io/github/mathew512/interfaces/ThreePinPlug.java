package io.github.mathew512.interfaces;

public interface ThreePinPlug {

    void accessPower();

    void printUsage();

    default void checkStatus() {
        System.out.println("Three-pin plug is functioning properly.");
        me();
    }
    static void printSpecifications() {
        System.out.println("Three-pin plug specifications: 220V, 50Hz, 13A.");
    }
    

    private void me() {
        System.out.println("This is a private method inside the ThreePinPlug interface.");
    }
}
