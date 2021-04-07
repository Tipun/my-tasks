package ex_3;

public class Main {
    public static void main(String[] args) {
        Printable pr1 = new Film("Зеленая миля", 2.25);
        Printable pr2 = new Film("Побег из Шоушенка", 2.40);
        Printable pr3 = new Film("Властелин колец", 3.12);
        Printable pr4 = new Serial("Доктор хаус", 25);
        Printable pr5 = new Serial("Мост", 30);
        Printable pr6 = new Serial("Ганнибал", 20);
        Printable[]movie = new Printable[6];
        movie[0]=pr1;
        movie[1]=pr2;
        movie[2]=pr3;
        movie[3]=pr4;
        movie[4]=pr5;
        movie[5]=pr6;

        for (Printable pr : movie) {
            pr.print();
        }
        System.out.println();
        Film.printFilms(movie);
        Serial.printSerials(movie);
    }
}
