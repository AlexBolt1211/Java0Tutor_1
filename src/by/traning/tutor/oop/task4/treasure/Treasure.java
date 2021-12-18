package by.traning.tutor.oop.task4.treasure;

import java.math.BigDecimal;
import java.util.Objects;

/*Создать консольное приложение, удовлетворяющее следующим требованиям:
• Приложение должно быть объектно-, а не процедурно-ориентированным.
• Каждый класс должен иметь отражающее смысл название и информативный состав.
• Наследование должно применяться только тогда, когда это имеет смысл.
• При кодировании должны быть использованы соглашения об оформлении кода java code convention.
• Классы должны быть грамотно разложены по пакетам.
• Консольное меню должно быть минимальным.
• Для хранения данных можно использовать файлы.
Дракон и его сокровища. Создать программу, позволяющую обрабатывать сведения о 100 сокровищах в пещере
дракона. Реализовать возможность просмотра сокровищ, выбора самого дорогого по стоимости сокровища и
выбора сокровищ на заданную сумму.*/

//Описание обьекта сокровище
public class Treasure {

    public String name;
    public BigDecimal cost;
    public Enum treasureTyp;

    public Treasure(String name, BigDecimal cost, Enum treasureTyp) {
        this.name = name;
        this.cost = cost;
        this.treasureTyp = treasureTyp;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BigDecimal getCost() {
        return cost;
    }

    public void setCost(BigDecimal cost) {
        this.cost = cost;
    }

    public Enum getTreasureTyp() {
        return treasureTyp;
    }

    public void setTreasureTyp(Enum treasureTyp) {
        this.treasureTyp = treasureTyp;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Treasure treasure = (Treasure) o;
        return Objects.equals(name, treasure.name) && Objects.equals(cost, treasure.cost) && Objects.equals(treasureTyp, treasure.treasureTyp);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, cost, treasureTyp);
    }

    @Override
    public String toString() {
        return "Treasure{" +
                "name:'" + name + '\'' +
                ", cost: " + cost +
                ", treasureTyp:" + treasureTyp +
                '}' + " \n";
    }
}
