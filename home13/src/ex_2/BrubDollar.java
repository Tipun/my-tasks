package ex_2;

import ex_1.Convertable;

public class BrubDollar implements Convertable {
    @Override
    public double convert(double rub){
        double dollar = rub / 2.5522;
        System.out.println(rub + " белорусских рубля равны " + dollar + " долларам ");
        return dollar;
    }
}
