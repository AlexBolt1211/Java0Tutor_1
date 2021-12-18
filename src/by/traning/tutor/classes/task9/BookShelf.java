package by.traning.tutor.classes.task9;

import java.util.Scanner;

public class BookShelf {

    public Book setBook(Scanner scanner) {
        Book book = new Book("", "", "", "", "", "", "");

        System.out.print("name: ");
        book.setName(AddBook.readNotEmptyString(scanner));

        System.out.print("authors: ");
        book.setAuthors(AddBook.readNotEmptyString(scanner));

        System.out.print("publisher: ");
        book.setPublisher(AddBook.readNotEmptyString(scanner));

        System.out.print("yearPublishing: ");
        book.setYearPublishing(AddBook.readNotEmptyString(scanner));

        System.out.print("numberPages: ");
        book.setNumberPages(AddBook.readNotEmptyString(scanner));

        System.out.print("bindingType: ");
        book.setBindingType(AddBook.readNotEmptyString(scanner));

        return book;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(" Введите данные о книгах: ");
        BookShelf bk = new BookShelf();
        Book[] book = new Book[1];
        //   book[0] = bk.setBook(scanner.ne());

        while (true) {
            System.out.println(
                    "Выберете пункт меню:\n"
                            + "0. выйти\n"
                            + "1. список книг заданного автора;\n"
                            + "2. список книг, выпущенных заданным издательством\n"
                            + "3. список книг, выпущенных после заданного года\n"
                            + ": "
            );
            int choice = scanner.nextInt();
            if (choice == 0)
                break;
            if (choice < 1 || choice > 3) {
                System.out.println("выбран неправильный пункт меню, повторите ввод.");
                continue;
            }

            switch (choice) {
                case 1:
                    System.out.print("Введите фамилию автора:");
                    String consoleAuthor = scanner.next();
                    System.out.println(consoleAuthor);
                    if(consoleAuthor.equals(book[0].getAuthors())){
                        System.out.println(book[0]);
                    };
                    break;
                case 2:
                    System.out.println(" Введите название издательства: ");
                    String consolePublisher = scanner.next();

                    break;
                case 3:
                    System.out.println(" Введите год издания:");

            }

        }
    }
}
