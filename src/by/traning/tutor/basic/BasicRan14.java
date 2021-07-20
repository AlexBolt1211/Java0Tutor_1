package by.traning.tutor.basic;

import java.util.stream.IntStream;

import static java.lang.Math.pow;

public class BasicRan14 {

//    Составить программу нахождения произведения квадратов первых двухсот чисел.

    public static void main(String[] args) {

        int result = 1;
        for (int i = 1; i <= 200; ++i) {
            result *= Math.pow(i,2);
        }
        System.out.println("Произведение квадратов первых 200 чисел: " + result);
    }
}