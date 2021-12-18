package by.traning.tutor.classes.task4;

// Cоздайте класс Train, содержащий поля: название пункта назначения, номер поезда, время отправления.
// Создайте данные в массив из пяти элементов типа Train, добавьте возможность сортировки элементов массива по
// номерам поездов. Добавьте возможность вывода информации о поезде, номер которого введен пользователем.
// Добавьте возможность сортировки массив по пункту назначения, причем поезда с одинаковыми пунктами
// назначения должны быть упорядочены по времени отправления.

import java.util.Arrays;
import java.util.Scanner;
import java.util.Comparator;

public class Train {
    public String destination;
    public int numberTrain;
    public double departureTime;

    public Train(String destination,int numberTrain, double departureTime){
        this.destination = destination;
        this.numberTrain = numberTrain;
        this.departureTime = departureTime;
    }

    public static class ByNumberTrainComparator implements Comparator < Train > {
        @Override
        public int compare(Train t1, Train t2) {
            return t1.numberTrain - t2.numberTrain;
        }
    }
    public static class ByDestinationAndTimeComparator implements Comparator < Train > {
        @Override
        public int compare(Train t1, Train t2) {
            if (t1.destination == t2.destination) {
                return Integer.compare(t1.numberTrain, t2.numberTrain);
            }
            return t1.destination.compareTo(t2.destination);
        }
    }
    void print(){
        System.out.println(destination + ","+ " номер поезда:"+ numberTrain +"  время: " + departureTime);
        return;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Train[] train = new Train[5];
        train[0] = new Train("Hamburg", 125, 14.15);
        train[1] = new Train("Berlin", 128, 18.15);
        train[2] = new Train("Saxony", 131, 5.31);
        train[3] = new Train("Bremen", 123, 12.34);
        train[4] = new Train("Bremen", 135, 9.45);

        System.out.println(" Все поезда ");
        for (int i = 0; i < train.length; i++) {
            train[i].print();
        }
        System.out.print("\n");
        Arrays.sort(train, new Train.ByNumberTrainComparator());
        System.out.println("Сортировка по номерам ");
        for (int i = 0; i < train.length; i++) {
            train[i].print();
        }
        System.out.print("\n");
        System.out.println(" Введите номер поезда");
        int numberTrainConsole = scanner.nextInt();
        train[numberTrainConsole].print();

        Arrays.sort(train, new Train.ByDestinationAndTimeComparator());
        System.out.print("\n");
        Arrays.sort(train, new Train.ByNumberTrainComparator());
        System.out.println("Сортировка по направлению и времени отправления ");
        for (int i = 0; i < train.length; i++) {
            train[i].print();
        }
    }
}
