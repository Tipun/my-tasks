package ex_2;

class Skirt extends Clothes implements WomanClothe{
    Skirt(Size size,double prise,String color){
        super(size,prise,color);
    }
    public void clotheAWoman(){
        System.out.println("Женская юбка размера " + size + " ,стоимостью " + prise + " ,цвета " + color);
    }
    @Override
    public String toString() {
        return "Галстук размера " + size + " ,стоимостью " + prise + " ,цвета " + color;
    }
}
