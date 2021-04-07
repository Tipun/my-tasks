package OOP_12;

public class Category {
    private String categoryName;
    private Prodact[]prodacts;
    Category(String categoryName,Prodact[]prodacts){
        this.categoryName = categoryName;
        this.prodacts = prodacts;
    }
    public String getCategoryName() {
        return categoryName;
    }
    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }
    public Prodact[] getProdacts() {
        return prodacts;
    }
    public void setProdacts(Prodact[] prodacts) {
        this.prodacts = prodacts;
    }
}
