package by.traning.tutor.oop.task4.menu;

import by.traning.tutor.oop.task4.caveDragon.DearestTreasure;
import by.traning.tutor.oop.task4.caveDragon.SelectionTreasuresAmount;
import by.traning.tutor.oop.task4.caveDragon.SortedCost;
import by.traning.tutor.oop.task4.caveDragon.TestAddTreasure;

import java.math.BigDecimal;
import java.util.Scanner;

public class Menu {

    public static void menuStart(){

        Scanner scanner = new Scanner(System.in);

        //переменная для выбора пункта меню
        String command;

        do {

            // указатели меню
            System.out.println("\n" + "Welcome to dragon cave, please make your choice and press Enter: " + "\n" +
                    "1.Show all treasures: " + "\n" +
                    "2.Choosing the most expensive treasure: " + "\n" +
                    "3.Choosing treasures for a given amount: " + "\n" +
                    "4.Exit: " + "\n");

            //инициализация переменной
            command = scanner.nextLine();

            switch (command){

                case "1":
                    //List<Treasure> treasureList = TestAddTreasure.getTreasureList();
                    //System.out.println(treasureList);
                    TestAddTreasure.setTreasureList().forEach(a -> System.out.println(a.toString()));
                    break;

                case "2":
                    System.out.println(DearestTreasure.sortingDearestTreasure(TestAddTreasure.setTreasureList()));
                    break;

                case "3":
                    SelectionTreasuresAmount.selectionTreasuresAmount(TestAddTreasure.setTreasureList(),
                            new BigDecimal("55"));


            }

        }
        while (!command.equals("4"));

        scanner.close();

    }
}
