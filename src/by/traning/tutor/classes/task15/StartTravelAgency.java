package by.traning.tutor.classes.task15;

import java.util.Scanner;

public class StartTravelAgency {
    public static String menu() {

        while (true) {
            Scanner scr = new Scanner(System.in);
            System.out.println(
                    "Выберете пункт меню:\n"
                            + "0. выйти\n"
                            + "1. выбор путёвки \n"
                            + "2. сортировка по цене\n"
                            + ": "
            );

            int choice = -1;
            if (scr.hasNextInt()) {
                choice = scr.nextInt();
                if (choice == 0)
                    break;
                if (choice < 1 || choice > 2) {
                    System.out.println("выбран неправильный пункт меню, повторите ввод.");
                    continue;
                }
            }

            switch (choice) {
                // выбор путёвки по типу
                case 1:
                    System.out.println(SortingTypeVoucher.sortingTypeVoucher(TravelRepository.travelVouchers()));

                //сортировка по цене для указанного типа путёвок
                case 2:

            }
        }
        return menu();
    }
}
