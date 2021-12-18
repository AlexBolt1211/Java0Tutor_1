package by.traning.tutor.basic;

// ((sin x + cos y) / (cos x - sin y)) * tanh(x * Y).
public class Task3 {

    public static void main(String[] args) {

        double x = 1;
        double y = 2;
        double result;

        result = (((Math.sin(x) + Math.cos(y)) / (Math.cos(x)) + Math.sin(y))) * Math.tanh(x * y);
        System.out.println(result);

    }
}