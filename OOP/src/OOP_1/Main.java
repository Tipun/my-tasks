package OOP_1;

public class Main {
    public static void main(String[] args) {
        Phone phone1 = new Phone();
        Phone phone2 = new Phone();
        Phone phone3 = new Phone();
        System.out.println("phone1 :\nnumber = " + phone1.number + "\nmodel = " + phone1.model + "\nweight = " + phone1.weight);
        System.out.println("phone2 :\nnumber = " + phone2.number + "\nmodel = " + phone2.model + "\nweight = " + phone2.weight);
        System.out.println("phone3 :\nnumber = " + phone3.number + "\nmodel = " + phone3.model + "\nweight = " + phone3.weight);
      //  System.out.println(phone1);
        phone1.reciveCall("Максим");
        phone1.getNumberTwo();
        phone2.reciveCall("Вадик");
        phone2.getNumberTwo();
        phone3.reciveCall("Федор");
        phone3.getNumberTwo();
        Phone.reciveCall("Вася", 789456123);
        phone1.sendMessage(7959275,7959273,7959271,5246412,5246416);
    }
}
