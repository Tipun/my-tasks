package WStatic_2;

public class Flower {
    private String country;
    private int shelfLife;
    private double prise;
    private static int count;
    public Flower(String country,int shelfLife,double prise){
        this.country = country;
        this.shelfLife = shelfLife;
        this.prise = prise;
        count++;
    }
    public String getCountry(){
        return country;
    }
    public void setCountry(String country){
        this.country = country;
    }

    public int getShelfLife() {
        return shelfLife;
    }

    public void setShelfLife(int shelfLife) {
        this.shelfLife = shelfLife;
    }

    public double getPrise() {
        return prise;
    }

    public void setPrise(double prise) {
        this.prise = prise;
    }
    public static int getCount(){
        return count;
    }
    public static void setCount(int count){
        Flower.count = count;
    }
}
