package Interface_4;

public class Tie extends Clothing implements WomansClothing {
    public Tie(int size, double cost, String color) {
        super(size, cost, color);
    }

    public void clo(){
        System.out.println("Вы одеты");
    }

       @Override
    public void dressAWoman() {
        System.out.println("Одета в футболку" + getSize() + " размера " + getColor() + " цвета " + ",стоимостью " + getCost());
    }
}
