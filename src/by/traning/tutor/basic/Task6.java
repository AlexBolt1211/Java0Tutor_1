package by.traning.tutor.basic;

//Дано натуральное число Т, которое представляет длительность прошедшего времени в секундах. Вывести
//данное значение длительности в часах, минутах и секундах в следующей форме:
//ННч ММмин SSc.
public class Task6 {

    public static void main(String[] args) {

        int input = 60;
        int hours = (input % 86400) / 3600;
        int minutes = ((input % 86400) % 3600) / 60;
        int seconds = ((input % 86400) % 3600) % 60;

        System.out.println(hours + "ч " + minutes + "мин " + seconds + "с");
    }
}
