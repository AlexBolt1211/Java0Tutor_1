package by.traning.tutor.basic;

public class BasicRun2 {
//             ((sin x + cos y) / (cos x - sin y)) * tanh(x * Y).

    public static void main(String[] args) {
        double x = 1;
        double y = 2;
        double result;

        result = (((Math.sin(x) + Math.cos(y)) / (Math.cos(x)) + Math.sin(y))) * Math.tanh(x * y);
        System.out.println(result);

//      double yRad = y * Math.PI / 180.0;
//      double xRad = x * Math.PI / 180.0;
//      double result = (((Math.sin(xRad) + Math.cos(yRad)) / (Math.cos(xRad) - Math.sin(yRad))) * Math.tan(xRad * yRad);
//      System.out.println(result);

    }
}