package by.traning.tutor.basic;

public class  BasicRun {
    // z = ( (a – 3 ) * b / 2) + c.


    public static void main(String[] args) {

        Integer a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        int c = Integer.parseInt(args[2]);

        double result = ((a - 3) * b / 2) + c;

        System.out.println("result: " + result);
    }
}
