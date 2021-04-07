package ex_2;

public class Prodact {
    private String name;
    private double weigth;
    private String color;
    Prodact(String name,double weigth,String color){
        this.name = name;
        this.weigth = weigth;
        this.color = color;
    }
    public String toString(){
        return "Игрушка: " + name + " ,вес: "+ weigth + " ,цвет: " + color;
    }
}
