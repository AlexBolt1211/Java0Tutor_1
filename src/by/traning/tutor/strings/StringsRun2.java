package by.traning.tutor.strings;
import java.util.Arrays;
import java.util.Random;

public class StringsRun2 {

    //Дана последовательность действительных чисел а1 ,а2 ,..., аn. Заменить все ее члены, большие данного Z, этим
    //числом. Подсчитать количество замен

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
