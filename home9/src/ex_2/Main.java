package ex_2;

public class Main {
    public static void main(String[] args) {
        Book book1 = new Book();
        Book book2 = new Book();
        Book book3 = new Book();
        book1.bookName = "Приключения";
        book2.bookName = "Словарь";
        book3.bookName = "Инциклопедия";
        Book[] books = new Book[3];
        books[0] = book1;
        books[1] = book2;
        books[2] = book3;
        Reader reader1 = new Reader();
        Reader reader2 = new Reader();
        Reader reader3 = new Reader();
        reader1.fio = "Петров В.В";
        reader2.fio = "Иванов И.И";
        reader3.fio = "Сидоров С.С";

        reader1.takeBook(5);
        reader2.takeBook("книга1","книга2","книга3");
        System.out.println();
        reader1.takeBook(books);
        System.out.println();
        reader3.returnBook(8);
        reader3.returnBook(books);
    }
}
