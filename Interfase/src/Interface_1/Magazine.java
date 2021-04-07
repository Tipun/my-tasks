package Interface_1;

public class Magazine implements Printable {
    String name;
    Magazine(String name){
        this.name = name;
    }
    public void print(){
        System.out.println("Журнал с названием " + name + " печатается");
    }
    public static void printMagazine(Printable[]printable){
        for(Printable pr : printable){
            if(pr instanceof Magazine){
                pr.print();
            }
        }
    }
}
