package by.traning.tutor.basic;

//    Составить программу нахождения произведения квадратов первых двухсот чисел.
public class Task16 {

    public static void main(String[] args) {

        int result = 1;
        for (int i = 1; i <= 200; ++i) {
            result *= Math.pow(i,2);
        }
        System.out.println("Произведение квадратов первых 200 чисел: " + result);
    }
}