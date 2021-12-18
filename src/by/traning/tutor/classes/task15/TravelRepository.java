package by.traning.tutor.classes.task15;

import java.util.List;

public class TravelRepository {
    // создадим список путёвок
    public static List<TravelVoucher> travelVouchers(){
        return List.of(
                new TravelVoucher(TypeVoucher.TRAVEL,"Необьятная Россия", 3150.5, TypeTransport.AUTO,
                        TypeNutrition.WITHOUTFOOD)
        );
    }
}
