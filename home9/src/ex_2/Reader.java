package ex_2;

public class Reader {
    String fio;
    int numberOfBilet;
    String fakultet;
    String dateOfBiorthday;
    int numberOfTelefon;

    void takeBook(int quantityOfBooks){
        System.out.println(fio + " взял " + quantityOfBooks + " книги");
    }
    void takeBook(String ... nameOfBook){
        System.out.print(fio + "взял книги : ");
        for (int i = 0; i < nameOfBook.length; i++) {
            if (i == nameOfBook.length){
                System.out.print(nameOfBook[i] + ".");
            }
            else {
                System.out.print(nameOfBook[i] + ", ");
            }
        }
    }
    void takeBook(Book ... books){
        System.out.print(fio + "взял книги : ");
        for (Book book : books) {
            System.out.print(book.bookName + ", ");
        }
    }
    void returnBook(int quantityOfBooks){
        System.out.println(fio + " вернул " + quantityOfBooks + " книги");
    }
    void returnBook(String ... nameOfBook){
        System.out.print(fio + "вернул книги : ");
        for (int i = 0; i < nameOfBook.length; i++) {
            if (i == nameOfBook.length){
                System.out.print(nameOfBook[i] + ".");
            }
            else {
                System.out.print(nameOfBook[i] + ", ");
            }
        }
    }
    void returnBook(Book ... books){
        System.out.print(fio + "вернул книги : ");
        for (Book book : books) {
            System.out.print(book.bookName + ", ");
        }
    }
}
