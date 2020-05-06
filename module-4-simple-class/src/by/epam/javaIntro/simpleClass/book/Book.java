package by.epam.javaIntro.simpleClass.book;

import java.io.FileNotFoundException;

public class Book {

    /*Создать класс Book, спецификация которого приведена ниже.
    Определить конструкторы, set- и get- методы и метод toString().
    Создать второй класс, агрегирующий массив типа Book,
    с подходящими конструкторами и методами. Задать критерии выбора данных и вывести эти данные на консоль.
    Book: id, название, автор(ы), издательство, год издания, количество страниц, цена, тип переплета.
    Найти и вывести:
    a) список книг заданного автора;
    b) список книг, выпущенных заданным издательством;
    c) список книг, выпущенных после заданного года.
     */

    private int id;
    private String name;
    private String author;
    private String publishing;
    private int yearPublished;
    private int numberOfPages;
    private int price;
    private String typeOfBinding;

    public Book(int id, String name, String author, String publishing, int yearPublished, int numberOfPages, int price, String typeOfBinding) {
        this.id = id;
        this.name = name;
        this.author = author;
        this.publishing = publishing;
        this.yearPublished = yearPublished;
        this.numberOfPages = numberOfPages;
        this.price = price;
        this.typeOfBinding = typeOfBinding;
    }

    public String getName() {
        return name;
    }

    public String getAuthor() {
        return author;
    }

    public String getPublishing() {
        return publishing;
    }

    public int getYearPublished() {
        return yearPublished;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", author='" + author + '\'' +
                ", publishing='" + publishing + '\'' +
                ", yearPublished=" + yearPublished +
                ", numberOfPages=" + numberOfPages +
                ", price=" + price +
                ", typeOfBinding='" + typeOfBinding + '\'' +
                '}';
    }

    public static void main(String[] args) throws FileNotFoundException {

        Library bookShell = new Library();

        bookShell.getBooksAfterYear(2000);
        bookShell.getBooksByAuthor("Harper Lee");
        bookShell.getBooksByPublishing("Arrow");
    }

}

