package by.traning.tutor.basic;

public class BasicRun13 {

//    Найти сумму квадратов первых ста чисел.

    public static void main(String[] args) {

        int sum = 0;
        for (int i = 1; i <= 100; i++) {
            sum += Math.pow(i,2);
        }
        System.out.println("Сумма квадратов чисел от 1 до 100 равна " + sum);
    }
}
