package ex_2;

import ex_1.Convertable;

import java.lang.constant.Constable;
import java.util.concurrent.ConcurrentMap;

public class EvroRub implements Convertable {
    @Override
    public double convert(double evro){
        double brub = evro * 3.03;
        System.out.println(evro + " евро равны " + brub + " белорусских рублей ");
        return brub;
    }
}
