package ex_2;

public abstract class Clothes {
Size size;
double prise;
String color;
Clothes(Size size,double prise,String color){
    this.size = size;
    this.prise = prise;
    this.color = color;
}

    @Override
    public String toString() {
        return "Одежда размера " + size + " ,стоимостью " + prise + " ,цвета " + color;
    }
}
