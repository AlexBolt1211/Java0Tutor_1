package by.traning.tutor.oop.task4.caveDragon;

import by.traning.tutor.oop.task4.treasure.Treasure;

import java.util.Comparator;
import java.util.List;

public class DearestTreasure {

    //collection.stream().max(String::compareTo).get()
    public static List<Treasure> sortingDearestTreasure(List<Treasure> treasureList) {
        //collection.stream().max(String::compareTo).get()
        //peoples.stream().max((p1, p2) -> p1.getAge().compareTo(p2.getAge())).get();
        //return treasureList.stream().max(Comparator.comparing(Treasure::getCost)).orElse(null);
        return treasureList.stream().max(Comparator.comparing(Treasure::getCost)).stream().toList();
        //return  treasureList.stream().max((t1, t2) -> t1.getCost().compareTo(t2.getCost()));
    }
}
