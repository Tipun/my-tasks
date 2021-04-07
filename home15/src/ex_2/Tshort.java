package ex_2;

public class Tshort extends Clothes implements ManClothe,WomanClothe{
    Tshort(Size size,double prise,String color){
        super(size,prise,color);
    }
    public void clotheAMan(){
        System.out.println("Мужская футболка размера " + size + " ,стоимостью " + prise + " ,цвета " + color);
    }
    public void clotheAWoman(){
        System.out.println("Женская футболка размера " + size + " ,стоимостью " + prise + " ,цвета " + color);
    }

    @Override
    public String toString() {
        return "Футболка размера " + size + " ,стоимостью " + prise + " ,цвета " + color;
    }
}
