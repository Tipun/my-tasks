package ex_3;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Book b1 = new Book("Маугли","Киплинг P.",1865);
        Book b2 = new Book("1984","Оруэл Дж.",1990);
        Book b3 = new Book("Шантарам","Робертс Г.",1976);
        Book b4 = new Book("Мастер и Маргарита","Булгаков М.",1926);
        Book b5 = new Book("Три товарища","Ремарк Э.",1937);
        Book b6 = new Book("Портрет Дорина Грея","Уайлд О.",1949);
        Book b7 = new Book("Над пропостью во ржи","Стейлинджер Дж.",1953);
        Book b8 = new Book("Маленький принц","Экзюпери А.",1953);

        Book[]books = new Book[8];
        books[0] = b1;
        books[1] = b2;
        books[2] = b3;
        books[3] = b4;
        books[4] = b5;
        books[5] = b6;
        books[6] = b7;
        books[7] = b8;

        Library l1 = new Library(books);

//        System.out.println();                   //поиск книги по какому нибудь признаку
//        l1.searchByTitle("Мастер и Маргарита");
//        System.out.println();
//        l1.searchByAutor("Оруэл Дж.");
//        System.out.println();
//        l1.searchByYear(1949);

    //    l1.delElement();         // удаление книги из списка
    //    l1.addElement(b8);        // добавление книги в список


    }
}
