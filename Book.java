package Homework14;

public class Book {
    //6) Write Book class that will have instance variables and 2 Constructors. While creating an object make sure:
    //Instance variables are being initialized
    //Both Constructors are being executed
    String bookName;
    String author;
    String language;
    int published;
    int pages;

    Book(String bookName1, String author1, String language1, int pages1) {
        bookName = bookName1;
        author = author1;
        language = language1;
        pages = pages1;

    }

    Book(String bookName2, String author2,int published1) {
        bookName = bookName2;
        author = author2;
        published = published1;

    }

    void PrintInfo() {
        if (pages == 0) {
            System.out.println("Book name :" + bookName + " author : " + author + " published in : " +published );
        } else {
            System.out.println("Name :" + bookName + "Author : " + author +"book is written in " + language + " and it has " + pages + " pages ");
        }

    }
}
