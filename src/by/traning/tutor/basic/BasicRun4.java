package by.traning.tutor.basic;

public class BasicRun4 {

    //   Дано натуральное число Т, которое представляет длительность прошедшего времени в секундах. Вывести
    //   данное значение длительности в часах, минутах и секундах в следующей форме:
    //   ННч ММмин SSc
    public static void main(String[] args) {

        int t = 79579;
        int hours = t / 3600;
        int result = t - (hours * 3600);
        int minutes = result / 60;
        int seconds = result - (minutes * 60);

        System.out.println("Исходная длительность в секундах: " + t);
        System.out.println(hours + " ч. " + minutes + " мин. " + seconds + " c.");

    }
}
