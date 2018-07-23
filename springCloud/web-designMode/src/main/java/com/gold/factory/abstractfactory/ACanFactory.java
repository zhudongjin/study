package com.gold.factory.abstractfactory;

public class ACanFactory implements CarFactory {
    @Override
    public Car createCar(String carBrand) {
        switch (carBrand) {
            case "BMO":
                return new BMWcar();
            case "BC":
                return new BCcar();
            default:
                return new BMWcar();
        }
    }
}
