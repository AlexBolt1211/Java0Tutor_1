package by.traning.tutor.strings;

import java.util.Arrays;
import java.util.Random;
public class StringsRun5 {
    //Даны целые числа а1 ,а2 ,..., аn . Вывести на печать только те числа, для которых аi > i.
    public static void main(String[] args) {
        Random random = new Random();
        int[] mass = new int[7];

        String currentArray="";
        for (int i = 0; i < mass.length; i++) {
            mass[i] = random.nextInt(15);
            currentArray=currentArray + mass[i] + " ";
            if (mass[i] > i) {
                System.out.print(mass[i] + "   ");
            }
        }
        System.out.println("\n" + currentArray);
    }
}
