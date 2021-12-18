package by.traning.tutor.classes.task14;

import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class BlockAccounts {


    //блокировка счета клиента
    public static void block(User user) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(" Введите имя счёта: ");
        String bankAccountName = scanner.next();
        List<Accounts> bankAccountsToBlock = user.getAccounts().stream().filter(accounts ->
                accounts.getName().equalsIgnoreCase(bankAccountName)).collect (Collectors.toList());
        bankAccountsToBlock.forEach(accounts -> accounts.setBlock(true));
        System.out.println(bankAccountsToBlock);
        return;
    }
}
