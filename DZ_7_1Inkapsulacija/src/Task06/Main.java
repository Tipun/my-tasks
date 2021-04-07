package Task06;

public class Main {
    public static void main(String[] args) {
    Bilet One = new Bilet(1,"Типун Максим" ,14);
    ExtraditionOfBook Ex = new ExtraditionOfBook("Мастер и Маргарита, Булгаков",1,3,12);
    ReternOfBook Ret = new ReternOfBook("Мастер и Маргарита, Булгаков",1,12);
    Ex.isDebtor(Ret);
    }
}