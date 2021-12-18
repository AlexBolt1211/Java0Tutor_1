package by.traning.tutor.classes.task10;
//Создать класс Airline, спецификация которого приведена ниже. Определить конструкторы, set- и get- методы
//и метод toString(). Создать второй класс, агрегирующий массив типа Airline, с подходящими конструкторами и
//методами. Задать критерии выбора данных и вывести эти данные на консоль.
//Airline: пункт назначения, номер рейса, тип самолета, время вылета, дни недели.
//Найти и вывести:
//a) список рейсов для заданного пункта назначения;
//b) список рейсов для заданного дня недели;
//c) список рейсов для заданного дня недели, время вылета для которых больше заданного.

import java.time.LocalTime;


public class Airline {

    public enum Airport {
        USA, SKF, EWR
    }

    private int flightNumber;
    private Airport departureAirport;
    private LocalTime departureTime;
    private Airport arrivalAirport;
    private LocalTime arrivalTime;





    public void display(){
        String info = "Рейс: " + flightNumber + "; ";
        info += "Аэропорт вылета: " + departureAirport;
        if (departureTime != null){
            info += "в " + departureTime;
        }
        info += "; ";
        info += "Аэропорт прибытия: " + arrivalAirport;
        if (arrivalAirport != null){
            info += " в " + arrivalTime;
        }
        System.out.println(info);
    }

}
