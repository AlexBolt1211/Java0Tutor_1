package by.traning.tutor.basic;

public class BasicRun9 {
//    Заданы размеры А, В прямоугольного отверстия и размеры х, у, z кирпича. Определить, пройдет ли кирпич через
//    отверстие


    public static void main(String[] args) {
        int a = 1;
        int b = 2;

        int x = 3;
        int y = 4;
        int z = 6;

        if (x <= a && y <= b || x <= b && y <= a ||
            x <= a && z <= b || z <= a && x <= b ||
                z <= a && y <= b || y <= a && z <= b) {
            System.out.println("Кирпич пройдёт через отверстие ");
        }else {
            System.out.println("Кирпич не пройдёт через отверстие ");
        }
    }
}


