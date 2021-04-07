package Task06;

public class ExtraditionOfBook {
    String titleAndAutor;
    int NamberOfBilet;
    int DateOfExtradition;
    int TimeOfExtradition;
      ReternOfBook a;
      Bilet b;
    public ExtraditionOfBook(String titleAndAutor, int NamberOfBilet, int DateOfExtradition, int TimeOfExtradition) {
        this.titleAndAutor = titleAndAutor;
        this.NamberOfBilet = NamberOfBilet;
        this.DateOfExtradition = DateOfExtradition;
        this.TimeOfExtradition = TimeOfExtradition;
    }
    public void isDebtor(ReternOfBook a){
        if(this.DateOfExtradition + this.TimeOfExtradition > a.DateOfRetern ){
            System.out.println("Владелец билета под номером " + a.NamberOfBilet + " является должником");
            System.out.println("Дата необходимого возврата " + a.DateOfRetern);
            System.out.println("Просрочка составляет " + (a.DateOfRetern - (this.DateOfExtradition + this.TimeOfExtradition))+ " дней");
            System.out.println("Имя и фамилия студентв " + b.NameAndSorname);
        }
    }
}
