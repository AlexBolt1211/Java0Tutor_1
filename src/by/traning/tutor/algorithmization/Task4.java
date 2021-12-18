package by.traning.tutor.algorithmization;

import java.util.Arrays;
import java.util.Random;

//Даны действительные числа а1 ,а2 ,..., аn . Поменять местами наибольший и наименьший элементы.
public class Task4 {
    public static void main(String[] args) {
        Random rnd = new Random();

        int[] mass = new int[15];
        int max = mass[0];
        int min = mass[0];

        int indexMax = 0;
        int indexMin = 0;

        String currentArray="";

        for (int i = 0; i < mass.length; i++) {
            mass[i] = rnd.nextInt(20);
            int element = mass[i];
            currentArray = currentArray + element +",";

            if (element > max) {
                max = element;
                indexMax = i;
            }

            if (element < min) {
                min = element;
                indexMin = i;
            }
        }
        mass[indexMax] = min;
        mass[indexMin] = max;

        System.out.println("source array: " + currentArray);
        System.out.println("result array: " + Arrays.toString(mass));

    }
}
