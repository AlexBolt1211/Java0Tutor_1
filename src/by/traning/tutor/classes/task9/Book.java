package by.traning.tutor.classes.task9;

import java.util.Objects;

public class Book {

    private int id;
    private String name;
    private String authors;
    private String publisher;
    private String yearPublishing;
    private String numberPages;
    private String price;
    private String bindingType;

    public Book(String name, String authors, String publisher, String yearPublishing, String numberPages, String price,
                String bindingType) {
        id = id + 1;
        this.name = name;
        this.authors = authors;
        this.publisher = publisher;
        this.yearPublishing = yearPublishing;
        this.numberPages = numberPages;
        this.bindingType = bindingType;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return id == book.id && Objects.equals(name, book.name) && Objects.equals(authors, book.authors) && Objects.equals(publisher, book.publisher) && Objects.equals(yearPublishing, book.yearPublishing) && Objects.equals(numberPages, book.numberPages) && Objects.equals(price, book.price) && Objects.equals(bindingType, book.bindingType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, authors, publisher, yearPublishing, numberPages, price, bindingType);
    }

    @Override
    public String toString() {
        String string = " ";
        string = string + name + authors + publisher + yearPublishing + numberPages + price + bindingType;
        return string;
    }

    public void print() {
        System.out.println();
        System.out.println(this);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthors() {
        return authors;
    }

    public void setAuthors(String authors) {
        this.authors = authors;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public String getYearPublishing() {
        return yearPublishing;
    }

    public void setYearPublishing(String yearPublishing) {
        this.yearPublishing = yearPublishing;
    }

    public String getNumberPages() {
        return numberPages;
    }

    public void setNumberPages(String numberPages) {
        this.numberPages = numberPages;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getBindingType() {
        return bindingType;
    }

    public void setBindingType(String bindingType) {
        this.bindingType = bindingType;
    }

}
