package by.traning.tutor.algorithmization;

import java.util.Arrays;

//В массиве целых чисел с количеством элементов n найти наиболее часто встречающееся число. Если таких
//чисел несколько, то определить наименьшее из них
public class Task9 {
    public static void main(String[] args) {

        int n = 50;
        int[] numbers = new int[n];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = (int) (Math.random() * 5);
        }

        Arrays.sort(numbers);
        int maxRepeat = 0;
        int minNumber = Integer.MAX_VALUE;
        for (int i = 0; i < numbers.length; i++) {
            int count = 0;
            for (int j = 0; j < numbers.length; j++) {
                if (numbers[i] == numbers[j]) {
                    count++;

                    if (count > maxRepeat) {
                        maxRepeat = count;
                        minNumber = numbers[i];
                    }
                }
            }
        }

        System.out.println("Old array: " + Arrays.toString(numbers));
        System.out.println("Max repeat: " + maxRepeat + " this number == " + minNumber);

    }
}
