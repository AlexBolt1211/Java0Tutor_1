package by.traning.tutor.classes.task15;


import java.util.List;
import java.util.stream.Collectors;

// сортировка путёвок по цене
public class SortingPriceVoucher {
    public static List<TravelVoucher> sortingPriceVoucher (List<TravelVoucher> travelVouchers, double price){
        return travelVouchers.stream().filter(travelVoucher -> travelVoucher.getTypeVoucher().equals(price)).
                collect(Collectors.toList());
    }
}
