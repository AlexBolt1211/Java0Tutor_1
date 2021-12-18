package by.traning.tutor.classes.task15;

import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;


//сортировка по типу путёвки
public class SortingTypeVoucher {

    public static List<TravelVoucher> sortingTypeVoucher (List<TravelVoucher> travelVouchers){
        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Введите тип путёвки: ");
        String typeV = scanner1.nextLine();
     return travelVouchers.stream().filter(travelVoucher -> travelVoucher.getTypeVoucher().equals(typeV)).
             collect(Collectors.toList());
    }
}
