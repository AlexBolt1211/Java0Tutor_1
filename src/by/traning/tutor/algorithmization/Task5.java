package by.traning.tutor.algorithmization;

import java.util.Random;

//Даны целые числа а1 ,а2 ,..., аn . Вывести на печать только те числа, для которых аi > i.
public class Task5 {
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
