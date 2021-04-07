package Interface_4;

public class Skirt extends Clothing implements WomansClothing{
    Skirt(int size,double cost,String color){
        super(size,cost,color);
    }
    public void clo(){
        System.out.println("Вы одеты");
    }

    @Override
    public void dressAWoman() {
        System.out.println("Одета в футболку" + getSize() + " размера " + getColor() + " цвета " + ",стоимостью " + getCost());
    }
}
