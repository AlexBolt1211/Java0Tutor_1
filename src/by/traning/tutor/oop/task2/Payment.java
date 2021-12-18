package by.traning.tutor.oop.task2;

import java.util.ArrayList;
import java.util.List;

//Создать класс Payment с внутренним классом, с помощью объектов которого можно сформировать покупку из
//нескольких товаров.
public class Payment {
    public String name;
    public double pricePayment;
    public List<Product> products = new ArrayList<>();

    public Payment(){}

    public Payment(String name, double pricePayment, List<Product> products) {
        this.name = name;
        this.pricePayment = pricePayment;
        this.products = products;
    }

    private class Product {
        private String productName;
        private double price;

        public Product(String productName, double price) {
            super();
            this.productName = productName;
            this.price = price;
        }

        public String getProductName() {
            return productName;
        }

        public double getPrice() {
            return price;
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPricePayment() {
        return pricePayment;
    }

    public void setPricePayment(double pricePayment) {
        this.pricePayment = pricePayment;
    }

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }

    public void addProduct(String productName,double price){
        products.add(new Product(productName,price));
        return;

    }

    public static void printPayment(Payment payment){
        payment.getProducts().forEach(p -> System.out.println(p.toString()));
        return;
    }

    @Override
    public String toString() {
        return "Payment{" +
                "name='" + name + '\'' +
                ", pricePayment=" + pricePayment +
                ", products=" + products +
                '}';
    }
}
