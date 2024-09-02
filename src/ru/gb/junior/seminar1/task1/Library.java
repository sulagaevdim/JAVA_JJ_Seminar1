package ru.gb.junior.seminar1.task1;

import java.util.ArrayList;
import java.util.List;

/**
 * Реализрвать систему учета клник в библиотеке. У каждой книги есть название, автор и год издания.
 * Необходимо создать список книг и выполнить следующие действия:
 * 1.обычный способ:
 * - найти все книги, написанные определенным автором
 * - найти все книги, изданные после определенного года
 * - найти все уникальные названия книг в библиотеке
 *
 * 2. с использлованием лямбда выражений:
 * - все те же задачи
 */
public class Library {
    public static void main(String[] args) {
        List<Book> books = new ArrayList<>();
        books.add(new Book("Преступление и наказание", "Ф.Достоевский", 1866));
        books.add(new Book("Евгений Онегин", "А.Пушкин", 1833));
        books.add(new Book("Мастер и Маргарита", "Л.Толстой", 1869));
        books.add(new Book("Мастер и Маргарита", "М.Булгаков", 1967));

        // поиск книг написанных автром
        List<Book> pushkinBooks = new ArrayList<>();
        for (Book book : books) {
            if ("А.Пушкин".equals(book.getAuthor())) pushkinBooks.add(book);
        }
        System.out.println(pushkinBooks);

        // поиск книг изданных после
        List<Book> yearBooks = new ArrayList<>();
        for (Book book : books) {
            if (book.getYear() >= 1866) yearBooks.add(book);
        }
        System.out.println(yearBooks);

        // поиск книг c уникальными названиями
        List<String> unicumBooks = new ArrayList<>();
        unicumBooks.add(books.get(0).getTitle());
        for (Book book : books) {
            if (unicumBooks.contains(book.getTitle())) unicumBooks.add(book.getTitle());
        }
        System.out.println(unicumBooks);
    }
}
