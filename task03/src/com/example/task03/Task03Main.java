package com.example.task03;

public class Task03Main {
    public static void main(String[] args) {
        ComplexNumber number = new ComplexNumber(2, 2);
        ComplexNumber number1 = new ComplexNumber(2, 2);

        System.out.println(number1.multiply(number).toString());
    }
}
