package by.traning.tutor.classes.task15;

// Туристические путевки. Сформировать набор предложений клиенту по выбору туристической путевки
// различного типа (отдых, экскурсии, лечение, шопинг, круиз и т. д.) для оптимального выбора. Учитывать
// возможность выбора транспорта, питания и числа дней. Реализовать выбор и сортировку путевок.

import java.util.List;
import java.util.Objects;

public class TravelVoucher {
    private Enum typeVoucher;
    private String name;
    private double price;
    private Enum typeTransport;
    private Enum typeNutrition;
    private List<Integer> day;

 //   public TravelVoucher(){};

    public TravelVoucher(Enum typeVoucher, String name, double price, Enum typeTransport, Enum typeNutrition) {
        this.typeVoucher = typeVoucher;
        this.name = name;
        this.price = price;
        this.typeTransport = typeTransport;
        this.typeNutrition = typeNutrition;
        this.day = day;
    }

    public Enum getTypeVoucher() {
        return typeVoucher;
    }

    public void setTypeVoucher(Enum typeVoucher) {
        this.typeVoucher = typeVoucher;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double isPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Enum getTypeTransport() {
        return typeTransport;
    }

    public void setTypeTransport(Enum typeTransport) {
        this.typeTransport = typeTransport;
    }

    public Enum getTypeNutrition() {
        return typeNutrition;
    }

    public void setTypeNutrition(Enum typeNutrition) {
        this.typeNutrition = typeNutrition;
    }

    public List<Integer> getDay() {
        return day;
    }

    public void setDay(List<Integer> day) {
        this.day = day;
    }

    @Override
    public String toString() {
        return "TravelVoucher{" +
                "typeVoucher=" + typeVoucher +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", typeTransport=" + typeTransport +
                ", typeNutrition=" + typeNutrition +
                ", day=" + day +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TravelVoucher that = (TravelVoucher) o;
        return price == that.price && Objects.equals(typeVoucher, that.typeVoucher) && Objects.equals(name, that.name) && Objects.equals(typeTransport, that.typeTransport) && Objects.equals(typeNutrition, that.typeNutrition) && Objects.equals(day, that.day);
    }

    @Override
    public int hashCode() {
        return Objects.hash(typeVoucher, name, price, typeTransport, typeNutrition, day);
    }
}
