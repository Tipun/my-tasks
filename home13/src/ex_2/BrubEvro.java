package ex_2;

import ex_1.Convertable;

public class BrubEvro implements Convertable {
    @Override
    public double convert(double rub){
        double evro = rub / 3.03;
        System.out.println(rub + " белорусских рубля равны " + evro + " евро ");
        return evro;
    }
}
