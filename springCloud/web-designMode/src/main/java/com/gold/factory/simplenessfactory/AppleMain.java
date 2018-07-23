package com.gold.factory.simplenessfactory;

public class AppleMain {
    public static void main(String[] args) {
        AppleFactory apple=new AppleFactory();
        System.out.println(apple.productionApple("yellow").getapple());
    }
}
