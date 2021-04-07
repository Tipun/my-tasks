package OOP_12;

public class Basket {
    Prodact[] payProdacts;

    public Basket(Prodact[] payProdacts) {
        this.payProdacts = payProdacts;
    }
    public Prodact[] getPayProdacts() {
        return payProdacts;
    }
    public void setPayProdacts(Prodact[] payProdacts) {
        this.payProdacts = payProdacts;
    }
}
