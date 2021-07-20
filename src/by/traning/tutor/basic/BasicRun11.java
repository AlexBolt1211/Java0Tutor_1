package by.traning.tutor.basic;

import java.util.Scanner;

public class BasicRun11 {

    //Напишите программу, где пользователь вводит любое целое положительное число. А программа суммирует
    //все числа от 1 до введенного пользователем числа.

    public static void main(String[] args) {

        System.out.print("Введите любое целое положительное число: ");
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();
        int sum = 0;
        for (int i = 1; i <= x; i++){
            sum = sum + i;
        }
        System.out.println (sum);
    }
}


