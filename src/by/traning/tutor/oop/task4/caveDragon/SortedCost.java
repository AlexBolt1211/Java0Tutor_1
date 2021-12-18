package by.traning.tutor.oop.task4.caveDragon;

import by.traning.tutor.oop.task4.treasure.Treasure;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

//  сортировка по цене
public class  SortedCost {

    public static List<Treasure> sortingCostTreasure(List<Treasure> treasureList) {

        return treasureList.stream().sorted(Comparator.comparing(Treasure::getCost)).collect(Collectors.toList());
    }
}
