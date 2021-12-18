package by.traning.tutor.classes.task14;

import java.util.Scanner;

public class BankingMenu {
    public String menu;

    public static String menu() {
        Scanner scr = new Scanner(System.in);
        while (true) {
            System.out.println(
                    "Выберете пункт меню:\n"
                            + "0. выйти\n"
                            + "1. отобразить информацию о всех счетах \n"
                            + "2. блокировка счёта\n"
                            + "3. поиск и сортировка счетов\n"
                            + "4. вычисление общей суммы по счетам\n"
                            + ": "
            );

            int choice = -1;
            if (scr.hasNextInt()) {
                choice = scr.nextInt();
                if (choice == 0)
                    break;
                if (choice < 1 || choice > 3) {
                    System.out.println("выбран неправильный пункт меню, повторите ввод.");
                    continue;
                }
            }


            switch (choice) {
                // метод вывода информации о всех счетах клиента
                case 1:






                    //AccountTransactions.accountPrint();


                    // блокировка, разблокировка счёта
                /*case 2:

                    System.out.println(" ведмте имя счёта который необходимо заблокировать");

                    String nextLine = "";
                    while (true) {
                        nextLine = scanner.nextLine();
                        if (scanner.hasNextLine()) {
                            break;
                        }
                    }
                    String bankAccountName = nextLine;
                    List<BankAccount> bankAccountsToBlock = user.getAccounts().stream().filter(bankAccount -> bankAccount.getName().equalsIgnoreCase(bankAccountName)).collect(Collectors.toList());
                    bankAccountsToBlock.forEach(bankAccount -> bankAccount.setBlock(true));
                    break;
                case 3:
                    // поиск и сортировка счетов
                    break;

                // вычисление общей суммы по счетам
                case 4:
            }*/
                    class Print {

                    }
            }
        }
        return menu();
    }
}