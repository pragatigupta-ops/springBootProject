package org.example;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        List<Integer> generate = PrimeNumberLambdaTest.generate(10);
        System.out.println(generate);
    }
}