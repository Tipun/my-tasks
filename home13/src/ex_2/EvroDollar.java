package ex_2;

import ex_1.Convertable;

public class EvroDollar implements Convertable {
    @Override
    public double convert(double evro){
        double dollar = evro / 0.84;
        System.out.println(evro + " евро равны " + dollar + " долларам ");
        return dollar;
    }
}
