package by.traning.tutor.basic;

public class Task8 {
//    Даны два угла треугольника (в градусах). Определить, существует ли такой треугольник, и если да, то будет ли
//    он прямоугольным.
public static void main(String[] args) {
    int a = 140;
    int b = 50;
    if ((a + b) < 180) {
        System.out.println("Такой треугольник сущевствует ");
        if ((a + b) == 90) {
            System.out.println("Треугольник прямоугольный");
        } else {
            System.out.println("Треуголник не прямоугольный");
        }
    }else {
        System.out.println("Треугольника с такими углами не сущевствует");
    }

    }
}

