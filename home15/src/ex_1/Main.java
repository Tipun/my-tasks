package ex_1;

public class Main {
    public static void main(String[] args) {
        Seasons sum =  Seasons.SUMMER;
        Seasons fall =  Seasons.FALL;
        Seasons win =  Seasons.WINTER;
        Seasons spr =  Seasons.SPRING;

        System.out.println(spr);
        Seasons.iLike(sum);
        Seasons.iLike(fall);
        Seasons.iLike(win);
        Seasons.iLike(spr);

        fall.getDeskription();
        sum.getDeskription();

        for (Seasons s : Seasons.values()){
            System.out.println(s.name() + " "+ s);
        }
    }
}
