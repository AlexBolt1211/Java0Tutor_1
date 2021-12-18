package by.traning.tutor.basic;

// R = nnn.ddd - поменять местами дробную и целочисленную части числа.
public class Task4 {

    public static void main(String[] args) {

        double x = 789.456;
        double y = (x * 1000) % 1000 + (int) x / 1000.;

        System.out.println("полученное значение " + y);
    }
}
