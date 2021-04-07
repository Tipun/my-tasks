package WStatic_2;

public class Main {
    public static void main(String[] args) {
//        Flower rose = new Rose("Germany", 4, 5);
//        Flower cornation = new Carnation("Belarus", 5, 2.5);
//        Flower tulip = new Tulip("Russia", 3, 3);
//        Flower chamomile = new Chamomile("Belarus", 5, 0.3);

        Flower[] bouquet1 = new Flower[3];
        bouquet1[0] = new Rose("Germany", 4, 5);
        bouquet1[1] = new Carnation("Belarus", 5, 2.5);
        bouquet1[2] = new Tulip("Russia", 3, 3);

        Flower[] bouquet2 = new Flower[3];
        bouquet2[0] = new Rose("Germany", 4, 5);
        bouquet2[1] = new Carnation("Belarus", 5, 2.5);
        bouquet2[2] = new Chamomile("Belarus", 5, 0.3);

        Flower[] bouquet3 = new Flower[7];
        bouquet3[0] = new Rose("Germany", 4, 5);
        bouquet3[1] = new Rose("Germany", 4, 5);
        bouquet3[2] = new Chamomile("Belarus", 5, 0.3);
        bouquet3[3] = new Chamomile("Belarus", 5, 0.3);
        bouquet3[4] = new Chamomile("Belarus", 5, 0.3);
        bouquet3[5] = new Chamomile("Belarus", 5, 0.3);
        bouquet3[6] = new Chamomile("Belarus", 5, 0.3);
        double commonPrise1 = 0;
        for(int i = 0; i < bouquet1.length; i++){
            commonPrise1 += bouquet1[i].getPrise();
        }
        System.out.println("Цена букета №1 " + commonPrise1);
        double commonPrise2 = 0;
        for(int i = 0; i < bouquet2.length; i++){
            commonPrise2 += bouquet2[i].getPrise();
        }
        System.out.println("Цена букета №2 " + commonPrise2);
        double commonPrise3 = 0;
        for(int i = 0; i < bouquet3.length; i++){
            commonPrise3 += bouquet3[i].getPrise();
        }
        System.out.println("Цена букета №3 " + commonPrise3);
        System.out.println("Общее кличество проданных цветов равно " + Flower.getCount());
    }
}
