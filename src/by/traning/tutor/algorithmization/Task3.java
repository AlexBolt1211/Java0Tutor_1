package by.traning.tutor.algorithmization;

import java.util.Random;

//Дан массив действительных чисел, размерность которого N. Подсчитать, сколько в нем отрицательных,
//положительных и нулевых элементов.
public class Task3 {
    public static void main(String[] args) {
        Random random = new Random();
        int mass[] = new int[10];
        int positive = 0;
        int negative = 0;
        int zero = 0;
        for (int i = 0; i < mass.length; i++) {
            mass[i] = random.nextInt();
            if (mass[i] > 0) {
                positive++;
            } else {
                if (mass[i] < 0) {
                    negative++;
                } else {
                    zero++;
                }
            }
        }
        System.out.println("Отрицательных элементов: " + negative);
        System.out.println("Равных нулю элементов: " + zero);
        System.out.println("Положительных элементов: " + positive);

    }
}
