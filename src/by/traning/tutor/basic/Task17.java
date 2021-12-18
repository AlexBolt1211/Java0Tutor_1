package by.traning.tutor.basic;

//Даны числовой ряд и некоторое число е. Найти сумму тех членов ряда, модуль которых больше или равен
//заданному е. Общий член ряда имеет вид:
public class Task17 {

    public static void main(String[] args) {

        int[] n = new int[120];
        int e = 3;
        double summ = 0;
        for (int i = 1; i <= n.length; i++) {
            double a = (1 / Math.pow(2, i) + 1 / Math.pow(3, i));
            if (a >= Math.abs(e)) {
                summ += a;
                System.out.println("n = " + i);
            }
            System.out.println("a = " + a);
        }
        System.out.println("result " + summ);
    }
}
