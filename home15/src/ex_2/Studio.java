package ex_2;

public class Studio implements ManClothe,WomanClothe{


    public void clotheAMan(Clothes[]clothes) {
        for(Clothes c : clothes){
            if(c instanceof ManClothe){
                System.out.println(c);
            }
        }
    }


    public void clotheAWoman(Clothes[]clothes) {
        for(Clothes c : clothes){
            if(c instanceof WomanClothe){
                System.out.println(c);
            }
        }
    }
}
