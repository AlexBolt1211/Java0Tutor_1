package by.traning.tutor.strings;
import java.util.Random;


public class StringsRun1 {

    public static void main(String[] args) {

        //1. В массив A [N] занесены натуральные числа. Найти сумму тех элементов, которые кратны данному К.");
        Random random = new Random();
        int k = 2;
        int[] a = new int[3];
        for (int x = 0;  x < a.length; x++ ){
            a[x] = random.nextInt(6 );
        }
        int sum = 0;

        for (int i = 0; i < a.length; i++) {
            if (a[i] % k == 0) {
                sum += a[i];
            }
        }
        System.out.println("Сумма элементов, которые кратны " + k + ", равна " + sum);
    }
}
