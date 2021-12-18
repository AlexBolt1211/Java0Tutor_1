package by.traning.tutor.algorithmization;

import java.util.Random;

// Задана последовательность N вещественных чисел. Вычислить сумму чисел, порядковые номера которых
//являются простыми числами.
public class Task6 {
    public static void main(String[] args) {

        Random rnd = new Random();

        int[] n = new int[10];
        int sum = 0;
        String currentArray = "";

        for (int i = 0; i < n.length; i++) {
            n[i] = rnd.nextInt(20);
            int element = n[i];
            currentArray = currentArray + element + ",";

            if ( i > 1 && i % i == 0 && i%2 != 0 && i%3 !=0 ){
                sum += n[i];
            }
        }

        System.out.println(currentArray);
        System.out.println(sum);

    }
}
