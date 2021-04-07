package WStatic_3;

public class Apricot extends Fruit {
    private double prise;
    public Apricot(double weight,double prise){
        super(weight);
        this.prise = prise;
    }

    public double getPrise() {
        return prise;
    }

    public void setPrise(double prise) {
        this.prise = prise;
    }

    public double fruitCost(){
        double coast = getWeight() * prise;
        return coast;
    }
}
