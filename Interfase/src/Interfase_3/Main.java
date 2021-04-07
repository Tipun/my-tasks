package Interfase_3;

public class Main {
    public static void main(String[] args) {
        Seasons lov = Seasons.SUMMER;
        //System.out.println(lov.getDeskription());
//        Seasons[]seasons = Seasons.values();
//        for(Seasons s : seasons){
//            System.out.println(s);
//        }

      // Seasons.love(lov);
      // lov.getDeskriptions(lov);
        Seasons[] seasons = new Seasons[4];
        seasons[0] = Seasons.SPRING;
        seasons[1] = Seasons.SUMMER;
        seasons[2] = Seasons.OUTUMN;
        seasons[3] = Seasons.WINTER;

        for(Seasons season: seasons){
            Seasons.love(season);
        }



    }
}
