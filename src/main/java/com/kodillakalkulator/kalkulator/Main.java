package com.kodillakalkulator.kalkulator;

public class Main {

    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        int number = 15;

        int result = calculator.add(number, 25);

        System.out.println(result);

        int substractResult = calculator.substract(30,5);

        System.out.println(substractResult);
    }

}
