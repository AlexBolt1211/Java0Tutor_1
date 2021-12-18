package by.traning.tutor.strings;

import java.util.Scanner;

public class StringsRun8 {


    public static void main(String [] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите размер массива N: ");
        int n = in.nextInt();
        double[] array = new double[n];
        if(array.length % 2 != 0){
            throw new IllegalArgumentException("Размер массива должен быть четным!!!");
        }
        System.out.println("Заполните массив: ");
        for(int i = 0; i < array.length; i++){
            array[i] = in.nextDouble();
        }
        System.out.println("Максимальная сумма = " + maxSumEvenArray(array));
    }
    public static double maxSumEvenArray(double[] array){
        double maxSum = array[0] + array[array.length - 1];
        for(int i = 1; i < array.length / 2; i++){
            if((array[i] + array[array.length - i - 1]) > maxSum){
                maxSum = array[i] + array[array.length - i - 1];
            }
        }
        return maxSum;
    }
}