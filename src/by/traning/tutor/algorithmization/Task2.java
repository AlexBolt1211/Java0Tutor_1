package by.traning.tutor.algorithmization;

import java.util.Arrays;
import java.util.Random;

// Дана последовательность действительных чисел а1 ,а2 ,..., ап. Заменить все ее члены, большие данного Z, этим
//числом. Подсчитать количество замен
public class Task2 {
    public static void main(String[] args) {

        Random random = new Random();
        int mass [] = new int[5];
        int z = 9;
        int result = 0;
        for (int i = 0; i < mass.length; i++){
            mass[i] = random.nextInt(20);
            if (mass[i] > z){
                mass[i] = z;
                result += 1;
            }
        }
        System.out.println(Arrays.toString(mass));
        System.out.println("Количество замен " + result);

    }
}
