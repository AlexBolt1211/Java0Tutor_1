package by.traning.tutor.basic;


public class BasicRun12 {

    // Вычислить значения функции на отрезке [а,b] c шагом h:
    public static void main(String[] args) {

        int a = 1;
        int b = 4;
        int h = 2;
        int y;

        for (int i = a; i <= b; i += h) {
            if (i > 2) {
                y = i;
            } else {
                y = i * (-1);
            }
            System.out.println("При х = " + i + " у = " + y);
        }
    }
}