package Interface_1;

public class Book implements Printable {
    String name;
    Book(String name){
        this.name = name;
    }
    public void print(){
        System.out.println("Книга с названием " + name + " печатается");
    }
    public static void printBooks(Printable[]printable){
        for(Printable pr : printable){
            if(pr instanceof Book){
                pr.print();
            }
        }
    }
}
