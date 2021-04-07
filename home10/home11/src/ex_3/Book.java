package ex_3;

public class Book {
    String title;
    String autor;
    int year;

    Book(String title, String autor, int year){
        this.title = title;
        this.autor = autor;
        this.year = year;
    }
    void about(){
        System.out.printf("Название : %s \t Автор : %s \t Год издания : %d", title,autor,year);
    }
    
}
