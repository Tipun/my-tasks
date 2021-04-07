package Interface_1;

public class Main {
    public static void main(String[] args) {
        Book b = new Book("Библия");
        b.print();
        Magazine m = new Magazine("Бурда");
        m.print();
        Printable[] printables = new Printable[4];
        printables[0] = b;
        printables[1] = m;
        printables[2] = new Book("Мастер и Маргарита");
        printables[3] = new Magazine("Cад и огород");

        for(Printable printable : printables){
            printable.print();
        }
        System.out.println();
        Book.printBooks(printables);
        System.out.println();
        Magazine.printMagazine(printables);
    }
}
