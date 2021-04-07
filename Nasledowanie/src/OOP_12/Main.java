package OOP_12;

public class Main {
    public static void main(String[] args) {
        Prodact pr1 = new Prodact("Жироудалитель", 12.50,5.0);
        Prodact pr2 = new Prodact("Акрилан", 11.20,4.2);
        Prodact pr3 = new Prodact("Прочистка труб", 2.70,4.8);
        Prodact pr4 = new Prodact("Сантехника", 8.35,3.8);

        Prodact[]prodacts = new Prodact[4];
        prodacts[0] = pr1;
        prodacts[1] = pr2;
        prodacts[2] = pr3;
        prodacts[3] = pr4;

        Category bagi = new Category("Баги", prodacts);

        Prodact[]payNow = new Prodact[3];
        payNow[0] = pr1;
        payNow[1] = pr2;
        payNow[2] = pr3;

        Basket pay1 = new Basket(payNow);

        User user1 = new User("Mak","sttr",pay1);
    }
}
