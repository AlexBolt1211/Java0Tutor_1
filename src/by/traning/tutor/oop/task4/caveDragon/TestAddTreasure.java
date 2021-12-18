package by.traning.tutor.oop.task4.caveDragon;

import by.traning.tutor.oop.task4.treasure.Treasure;

import java.math.BigDecimal;
import java.util.List;

import static by.traning.tutor.oop.task4.treasure.TreasureTyp.MEDALLION;


// добавление сокровищ в хранилище
public class  TestAddTreasure {

    public static List<Treasure> setTreasureList(){

        return List.of(
                new Treasure("ecde1", BigDecimal.valueOf(6.0), MEDALLION),
                new Treasure("ecde2", BigDecimal.valueOf(9.1), MEDALLION),
                new Treasure("ecde3", BigDecimal.valueOf(14.2), MEDALLION),
                new Treasure("ecde4", BigDecimal.valueOf(2.0), MEDALLION),
                new Treasure("ecde5", BigDecimal.valueOf(250.7), MEDALLION),
                new Treasure("ecde6", BigDecimal.valueOf(10.2), MEDALLION),
                new Treasure("ecde7", BigDecimal.valueOf(50.2), MEDALLION)
        );
    }
}
