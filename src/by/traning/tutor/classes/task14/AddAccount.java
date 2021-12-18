package by.traning.tutor.classes.task14;

//Счета. Клиент может иметь несколько счетов в банке. Учитывать возможность блокировки/разблокировки
//счета. Реализовать поиск и сортировку счетов. Вычисление общей суммы по счетам. Вычисление суммы по
//всем счетам, имеющим положительный и отрицательный балансы отдельно.

import java.util.List;


public class AddAccount {
    // создадим счета клиента
     public static List<Accounts> accounts(){
         return List.of(
                 //new Accounts("USD", "1111", 100.00),
                 //new Accounts("EUR", "1111", 100.00),
                 //new Accounts("BYN", "1111", 101.00),
                 //new Accounts("BYN", "1112", 102.00),
                 //new Accounts("BYN", "1113", 103.00)
         );
     }
}
