package OOP_4;

import java.util.Date;
import java.util.GregorianCalendar;

public class Main {
    public static void main(String[] args) {


        Reader[] readers = new Reader[4];
        readers[0] = new Reader("Типун.M.А.", 1, "СФ", new GregorianCalendar(1985, 4, 2), 7959275);
        readers[1] = new Reader("Типун.Т.И.", 2, "ПФ", new GregorianCalendar(1962, 3, 12), 7959273);
        readers[2] = new Reader("Типун.А.М.", 3, "ГМФ", new GregorianCalendar(1960, 2, 22), 7973673);
        readers[3] = new Reader("Типун.А.А.", 4, "ГеоФ", new GregorianCalendar(1998, 0, 8), 5324730);
        for (Reader reader : readers) {
            reader.takeBook(3);
        }

        Book[] books = new Book[5];
        books[0] = new Book("М.Булгаков", "Мастер и Маргарита");
        books[1] = new Book("А.Мицкевич", "Пан Тадеуш");
        books[2] = new Book("Н.Гоголь", "Мертвые души");
        books[3] = new Book("Ф.Достоевский", "Преступление и наказание");
        books[4] = new Book("K.Толстой", "Война и мир");

        readers[0].takeBook(books[0].Book,books[1].Book,books[4].Book);
        readers[2].returnBook(books[2].Book,books[3].Book,books[4].Book);
    }
}