package WStatic_3;

public class Main {
    public static void main(String[] args) {
        Fruit apple1 = new Apple(2.3,2.25);
        Fruit apple2 = new Apple(5.6,2.25);
        Fruit apple3 = new Apple(2.2,2.25);
        Fruit pear1 = new Pear(10.0,3.20);
        Fruit pear2 = new Pear(5.0,3.20);
        Fruit pear3 = new Pear(3.0,3.20);
        Fruit apricot1 = new Apricot(4.0,4.80);
        Fruit apricot2 = new Apricot(1.5,4.80);
        Fruit apricot3 = new Apricot(2.3,4.80);
        Fruit[]fruits = new Fruit[9];
        fruits[0] = apple1;
        fruits[1] = apple2;
        fruits[2] = apple3;
        fruits[3] = pear1;
        fruits[4] = pear2;
        fruits[5] = pear3;
        fruits[6] = apricot1;
        fruits[7] = apricot2;
        fruits[8] = apricot3;
        double commonCostFruits = 0;
        for (int i = 0; i < fruits.length; i++) {
            commonCostFruits += fruits[i].fruitCost();
        }
        System.out.println("Общая стоимость проданных фруктов " + commonCostFruits );
        double commonCostApples = 0;
        for (int i = 0; i < 3; i++) {
            commonCostApples += fruits[i].fruitCost();
        }
        System.out.println("Общая стоимость проданных яблок " + commonCostApples );
        double commonCostPears = 0;
        for (int i = 3; i < 6; i++) {
            commonCostPears += fruits[i].fruitCost();
        }
        System.out.println("Общая стоимость проданных груш " + commonCostPears );
        double commonCostApricots = 0;
        for (int i = 6; i < 9; i++) {
            commonCostApricots += fruits[i].fruitCost();
        }
        System.out.println("Общая стоимость проданных абрикосов " + commonCostApricots );
    }
}
