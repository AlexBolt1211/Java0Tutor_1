package by.traning.tutor.basic;

// R = nnn.ddd - поменять местами дробную и целочисленную части числа.

public class BasicRun3 {
    public static void main(String[] args) {
        double x = 789.456;
        double y = (x * 1000) % 1000 + (int) x / 1000.;
        System.out.println("полученное значение " + y);
    }
}
//    double init = 123.456;
//
//    int firstPart = (int) init;
//    int secondPart = (int)((init - firstPart) * 1000);
//    double result = secondPart + firstPart * 0.001;

//    System.out.println("Исходное число " + init);
//    System.out.println("Полученное число " + result);