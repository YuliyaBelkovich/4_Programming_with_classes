package by.epam.javaIntro.simpleClass.book;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Library {

    private Book [] bookShell;

    public Library() throws FileNotFoundException {
        File bookShell = new File("C:\\Users\\Asus\\IdeaProjects\\module-4-simple-class\\src\\by\\epam\\javaIntro\\simpleClass\\Book\\BookShell.txt");
        Scanner sc = new Scanner(bookShell);

        int i = 0;
        this.bookShell = new Book[6];

        while(sc.hasNextLine()){
            String [] tmp = sc.nextLine().split(",");
            this.bookShell[i] = new Book(Integer.parseInt(tmp[0]),
                    tmp[1],
                    tmp[2],
                    tmp[3],
                    Integer.parseInt(tmp[4]),
                    Integer.parseInt(tmp[5]),
                    Integer.parseInt(tmp[6]),
                    tmp[7]);
            i++;
        }
    }

    public void getBooksByAuthor(String author){
        System.out.println("Books by "+author+ ":");
        for(Book book : this.bookShell ){
            if(book.getAuthor().equals(author)){
                System.out.println(book.getName());
            }
        }
    }

    public void getBooksByPublishing(String publishing){
        System.out.println("Books published by "+publishing+ " publishing:");
        for(Book book : this.bookShell){
            if(book.getPublishing().equals(publishing)){
                System.out.println(book.getName());
            }
        }
    }

    public void getBooksAfterYear(int year) {
        System.out.println("Books published after " + year + " year:");
        for (Book book : this.bookShell) {
            if (book.getYearPublished() > year) {
                System.out.println(book.getName());
            }
        }
    }
}

