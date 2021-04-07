package OOP_12;

public class Prodact {
    private String prodactName;
    private double price;
    private double reting;

    Prodact(String prodactName, double price, double reting) {
        this.prodactName = prodactName;
        this.price = price;
        this.reting = reting;
    }

    private String getProdactName() {
        return prodactName;
    }

    private void setProdactName(String prodactName) {
        this.prodactName = prodactName;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getReting() {
        return reting;
    }

    public void setReting(double reting) {
        this.reting = reting;
    }
}
