package main;

import manager.BookManager;
import model.Book;
import model.NovelBook;
import model.ScienceBook;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Book[] books = new Book[9];

        books[0] = new Book("A", 10000, 10, "14/12/2021");
        books[1] = new Book("B", 90000, 20, "14/12/2021");
        books[2] = new Book("C", 30000, 30, "14/12/2021");
        books[3] = new ScienceBook("D", 10000, 40, "14/12/2021", "Java");
        books[4] = new ScienceBook("E", 50000, 50, "14/12/2021", "PHP");
        books[5] = new ScienceBook("F", 60000, 60, "14/12/2021", "PHP");
        books[6] = new NovelBook("G", 70000, 70, "14/12/2021", "Dương");
        books[7] = new NovelBook("H", 80000, 80, "14/12/2021", "Dương");
        books[8] = new NovelBook("J", 90000, 90, "14/12/2021", "Hiếu");

        BookManager bookManager = new BookManager();
        bookManager.displayAllBook(books);
        double sum = bookManager.sumPrice(books);
        System.out.println(sum);
        bookManager.maxPrice(books);
        bookManager.minPrice(books);
        System.out.println("Nhập vào thể loại muốn tìm: ");
        String type = scanner.nextLine();
        bookManager.searchByType(books, type);
        System.out.println("Nhập vào tác giả muốn tìm: ");
        String author = scanner.nextLine();
        bookManager.searchByAuthor(books, author);
        System.out.println("Giá trung bình của sách khoa học là: ");
        bookManager.averagePriceOfScienceBook(books);
        System.out.println("-------------------Nâng cao----------------------");
        System.out.println("Các quyển sách tiểu thuyết là: ");
        bookManager.displayNovelBook(books);
        System.out.println("Các quyển sách khoa học là: ");
        bookManager.displayScienceBook(books);
        System.out.println("Nhập vào giá sách muốn tìm: ");
        long price = scanner.nextLong();
        bookManager.searchByPrice(books, price);
        System.out.println("Nhập vào khoảng giá muốn tìm: ");
        System.out.println("Từ: ");
        long minPrice = scanner.nextLong();
        System.out.println("Đến: ");
        long maxPrice = scanner.nextLong();
        bookManager.rangePrice(books, minPrice, maxPrice);

    }
}
