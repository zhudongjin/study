package com.gold.factory.simplenessfactory;

public class AppleFactory {

    public Apple productionApple(String str) {

        switch (str) {
            case "red":
                return new RedAppleImpl();
            case "yellow":
                return new YellowAppleImpl();
            default:
                return new RedAppleImpl();
        }
    }
}
