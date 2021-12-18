package by.traning.tutor.algorithmization;

import java.util.Arrays;

//Дан целочисленный массив с количеством элементов n. Сжать массив, выбросив из него каждый второй
//элемент (освободившиеся элементы заполнить нулями). Примечание. Дополнительный массив не использовать.
public class Task10 {
    public static void main(String[] args) {

        int n = 60;
        int[] numbers = new int[n];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = i + 1;
        }

        int j = 1;

        for (int i = 2; i < numbers.length; i += 2) {
            numbers[j] = numbers[i];
            j++;
        }

        for (int i = numbers.length/2; i < numbers.length; i ++) {
            numbers[i] = 0;
        }

        System.out.println("Every second element is replaced by zero: " + Arrays.toString(numbers));

    }
}
