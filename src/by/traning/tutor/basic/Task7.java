package by.traning.tutor.basic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//Для данной области составить линейную программу, которая печатает true, если точка с координатами (х, у)
//принадлежит закрашенной области, и false — в противном случае:
public class Task7 {

    public static void main(String[] args) {

        System.out.println("Введите x ");
        int x = scannerInt();
        System.out.println("Введите y ");
        int y = scannerInt();

        if ((y >= 0 && y <= 4 && x >= -2 && x <= 2) || (y >= -3 && y <= 0 && x >= -4 && x <= 4)){
            System.out.print("True: ");
        }
        else{
            System.out.print("False: ");
        }
        System.out.println("Точка с координатами (" + x + ", " + y + ") принадлежит закрашенной области");

    }

    private static int scannerInt() {
        try {
            BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
            return Integer.parseInt(in.readLine());
        } catch (IOException e) {
            e.printStackTrace();
            return 0;
        }
    }
}

