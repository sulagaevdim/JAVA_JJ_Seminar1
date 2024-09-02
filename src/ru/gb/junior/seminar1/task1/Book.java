package ru.gb.junior.seminar1.task1;

public class Book {
    //region Поля
    private final String title;
    private final String author;
    private final int year;
    //endregion
    //region Методы
    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getYear() {
        return year;
    }
    @Override
    public String toString() {
        return "Книга: " + title + " (" + author + ") " + year + "гг.";
    }
    //endregion
    //region Конструктор
    public Book(String title, String author, int year) {
        this.title = title;
        this.author = author;
        this.year = year;
    }
    //endregion

}
