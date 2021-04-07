package ex_2;

public class Main {
    public static void main(String[] args) {
        double currency = 100;
        new DollarBrub().convert(currency);
        new DollarEvro().convert(currency);
        new EvroRub().convert(currency);
        new EvroDollar().convert(currency);
        new BrubDollar().convert(currency);
        new BrubEvro().convert(currency);
    }
}
