package by.traning.tutor.algorithmization;

import java.util.Arrays;

//Дана последовательность целых чисел a1, a2, ... an. Образовать новую последовательность, выбросив из
//исходной те члены, которые равны
//min(a1,a2,...an).
public class Task8 {

    public static void main(String[] args) {
        int n = 20;
        int[] numbers = new int[n];
        int min = Integer.MAX_VALUE;

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = (int) (Math.random() * 10);
            if (numbers[i] < min) {
                min = numbers[i];
            }
        }

        int count = 0;
        for (int i = 0; i < numbers.length; i++){
            if(numbers[i] == min){
                count++;
            }
        }

        int[] newArray = new int[n-count];

        int j = 0;
        for(int i = 0; i < numbers.length; i++){
            if (numbers[i] != min){
                newArray[j] = numbers[i];
                j++;

            }

        }
        System.out.println("Old array: " + Arrays.toString(numbers)+ " oldArray.length == " + numbers.length);
        System.out.println("New array: " + Arrays.toString(newArray) + " newArray.length == " + newArray.length);

    }
}
