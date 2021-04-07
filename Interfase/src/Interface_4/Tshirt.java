package Interface_4;

public class Tshirt extends Clothing implements MensClothing,WomansClothing {
    public Tshirt(int size, double cost, String color) {
        super(size, cost, color);
    }

    public void clo(){
        System.out.println("Вы одеты");
    }

    @Override
    public void dressAMan() {
        System.out.println("Одет в футболку" + getSize() + " размера " + getColor() + " цвета " + ",стоимостью " + getCost());
    }

    @Override
    public void dressAWoman() {
        System.out.println("Одета в футболку" + getSize() + " размера " + getColor() + " цвета " + ",стоимостью " + getCost());
    }
}
