package by.traning.tutor.oop.task4.caveDragon;

import by.traning.tutor.oop.task4.treasure.Treasure;

import java.math.BigDecimal;
import java.util.List;
import java.util.Random;

public class SelectionTreasuresAmount {

    public static void selectionTreasuresAmount(List<Treasure> treasures, BigDecimal bigDecimal){
        Random random = new Random();

        BigDecimal cost = new BigDecimal("0");
        BigDecimal sum1 = new BigDecimal("0");

        for (Treasure tr : treasures){
            int i = random.nextInt(7);
            cost = treasures.get(i).getCost();
            System.out.println("стоимость рандомного сокровища: " + cost);
            sum1 = sum1.add(cost);

            if (sum1.compareTo(bigDecimal) <= 0){
                System.out.println("заданная сумма: " + bigDecimal);
                System.out.println("сравнение было");
                System.out.println(treasures.get(i));
                System.out.println(" стоимость выбранных сокровищ:  " + sum1);
                System.out.println("______________________");

            }else {
                System.out.println("стоимость выбранных сокровищ больше заданной суммы " );
                sum1 = sum1.subtract(bigDecimal);
                System.out.println("остаток: "  + sum1 );
                break;
            }
        }
        return;
    }
}
