package ex_3;

public class Main {
    public static void main(String[] args) {


        Prodact peach = new Prodact("Персик",3.5,5.0);
        Prodact orange = new Prodact("Апельсин",3.1,4.8);
        Prodact apple = new Prodact("Яблоко",2.2,4.2);
        Prodact wolf = new Prodact("Волк",12.6,3.9);
        Prodact bear = new Prodact("Медведь",15.3,4.1);
        Prodact cat = new Prodact("Кот",14.2,5.0);

        Prodact[] fru = new Prodact[3];
        fru[0] = peach;
        fru[1] = orange;
        fru[2] = apple;
        Prodact[] to = new Prodact[3];
        to[0] = wolf;
        to[1] = bear;
        to[2] = cat;
        Prodact[] bought = new Prodact[3];
        bought[0] = cat;
        bought[1] = peach;
        bought[2] = apple;
        Basket basket1 = new Basket(bought);


        Category fruit = new Category("Фрукты",fru);
        Category toes = new Category("Игрушки",to);
        User us1 = new User("user1","112233",basket1);
    }
}
