package Interface_4;

public class Main {
    public static void main(String[] args) {
        Clothing[]closes = new Clothing[4];
        closes[0] = new Tshirt(52,120,"Синий");
        closes[1] = new Pants(50,110,"Черный");
        closes[2] = new Skirt(42,80,"Белый");
        closes[3] = new Tie(30,25,"Зеленый");

        Studios.dressAMan(closes);
        System.out.println();
        Studios.dressAWoman(closes);
    }
}
