package ru.gb.junior.seminar1.task1;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class LibraryStreamAPI {
    public static void main(String[] args) {
        List<Book> books = new ArrayList<>();
        books.add(new Book("Преступление и наказание", "Ф.Достоевский", 1866));
        books.add(new Book("Евгений Онегин", "А.Пушкин", 1833));
        books.add(new Book("Мастер и Маргарита", "Л.Толстой", 1869));
        books.add(new Book("Мастер и Маргарита", "М.Булгаков", 1967));

        // поиск книг написанных автром
        List<Book> authorBook = books.stream().filter(book -> "А.Пушкин".equals(book.getAuthor())).toList();
        System.out.println(authorBook);
//

        // поиск книг изданных после
        List<Book> yearBooks = books.stream().filter(book -> book.getYear()>=1866).toList();
        System.out.println(yearBooks);

        // поиск книг c уникальными названиями
        List<String> unicumBooks = books.stream().map(Book::getTitle).distinct().toList();
        System.out.println(unicumBooks);
    }
}
