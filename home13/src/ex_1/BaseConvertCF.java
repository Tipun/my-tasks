package ex_1;

public class BaseConvertCF implements Convertable{
    @Override
    public double convert(double cel) {
        double far = cel * 1.8 + 32;
        System.out.println(cel + " градусов Цельсия равны " + far + " градусам по Фарингейту");
        return far;
    }
}
