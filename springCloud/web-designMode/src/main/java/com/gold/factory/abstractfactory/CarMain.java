package com.gold.factory.abstractfactory;

public class CarMain {
    public static void main(String[] args) {
        CarFactory cf=new ACanFactory();
        cf.createCar("BMW").getCarInfo();
    }
}
