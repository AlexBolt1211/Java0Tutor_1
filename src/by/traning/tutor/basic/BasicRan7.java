package by.traning.tutor.basic;

public class BasicRan7 {

//    Найти max{min(a, b), min(c, d)}.

    public static void main(String[] args) {
        int a = 0;
        int b = 1;
        int c = 2;
        int d = 4;
        int first;
        int second;
        System.out.println("Искомое значение ");
        if (a < b){
            first = a;
        }else {
            first = b;
        }
        if (c < d){
            second = c;
        }else {
            second = d;
        }
        if (first > second){
            System.out.println(first);
        }else {
            System.out.println(second);
        }
    }
}


//   int a, b, c, d;
//   int first = Math.min(a, b);
//   int second = Math.min(c, d);
//   int result = Math.max(first,second);
//   System.out.println(result);