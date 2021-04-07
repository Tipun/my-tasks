package ex_3;

import java.util.Scanner;

public class Library {
    Book[]books;
    Library(Book[]books){
        this.books = books;
    }
    void searchByTitle(String word){
        for (int i = 0; i < books.length; i++) {
            if(books[i].title == word){
                books[i].about();
            }
        }
    }
    void searchByAutor(String word){
        for (int i = 0; i < books.length; i++) {
            if(books[i].autor == word){
                books[i].about();
            }
        }
    }
    void searchByYear(int year){
        for (int i = 0; i < books.length; i++) {
            if(books[i].year == year){
                books[i].about();
            }
        }
    }
    void showLibrary(){
        for (int i = 0; i < books.length; i++) {
            System.out.print(i + 1 + ". ");
            books[i].about();
            System.out.println();
        }
    }
    void delElement(){
        System.out.println("Библиотека сейчас: ");
        showLibrary();
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите номер книги, которую хотите удалить.");
        int number = sc.nextInt();
        Book[]delBooks = new Book[books.length - 1];

        System.arraycopy(books,0,delBooks,0,number-1);
        System.arraycopy(books,number,delBooks,number-1,books.length - number );
        for (int i = 0; i < delBooks.length; i++) {
            System.out.print(i + 1 + ". ");
            delBooks[i].about();
            System.out.println();
        }
    }
    void addElement(Book book){
        System.out.println("Библиотека сейчас: ");
        showLibrary();

        Book[]addBooks = new Book[books.length + 1];

        System.arraycopy(books,0,addBooks,0,books.length);
        addBooks[addBooks.length - 1] = book;
        for (int i = 0; i < addBooks.length; i++) {
            System.out.print(i + 1 + ". ");
            addBooks[i].about();
            System.out.println();
        }
    }
}
