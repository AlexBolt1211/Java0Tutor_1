package by.traning.tutor.basic;

import java.util.Scanner;

//Для каждого натурального числа в промежутке от m до n вывести все делители, кроме единицы и самого числа.
//m и n вводятся с клавиатуры.
public class Task19 {

    public static void main(String[] args) {

        System.out.println("Введите m и n");
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        while (m < n){
            m++;
            for (int i = 2; i < m; i++) {
                if (m % i == 0){
                    System.out.println(i + " => " + m);
                }
            }
        }
    }
}
