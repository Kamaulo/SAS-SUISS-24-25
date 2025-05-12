package com.saslab;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        Calculator calculator = new Calculator();
        System.out.println("10 + 22 = " + calculator.sum(10, 22));
        System.out.println("11 * 156 = " + calculator.multiply(11, 156));
        System.out.println("Ciao");
    }
}