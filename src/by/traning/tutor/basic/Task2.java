package by.traning.tutor.basic;

//(b+√(𝑏^2 + 4𝑎𝑐))/2𝑎 − (𝑎^3)*𝑐 + (𝑏^−2).
public class Task2 {

    public static void main(String[] args) {

        int a = 1;
        int b = 7;
        int c = 3;

        double z = Math.sqrt(Math.pow(b,2) + 4 * a * c);
        double result = ((b + z) / (2 * a)) - (Math.pow(a, 3)) * c - (Math.pow(b,-1));

        System.out.println( "result: " + result);
    }
}
