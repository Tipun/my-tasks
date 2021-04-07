package ex_2;

import ex_1.Convertable;

public class DollarEvro implements Convertable {
    @Override
    public double convert(double dollar){
        double evr = dollar * 0.84;
        System.out.println(dollar + " долларов равны " + evr + " евро ");
        return evr;
    }
}
