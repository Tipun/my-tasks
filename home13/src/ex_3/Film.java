package ex_3;

public class Film implements Printable {
    String name;
    double length;
    Film(String name,double length){
        this.name = name;
        this.length = length;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    @Override
    public void print() {
        System.out.println("Фильм: " + name + " ,длинна: " + length);
    }
    public static void printFilms(Printable[]printables){
        for (Printable p : printables) {
           if (p instanceof Film){
               System.out.println("Это Фильм: " + ((Film) p).getName() + " ,длинна: " + ((Film)p).getLength());
           }
        }

    }
}
