package ex_2;

class Pants extends Clothes implements ManClothe,WomanClothe{
    Pants(Size size,double prise,String color){
        super(size,prise,color);
    }
    public void clotheAMan(){
        System.out.println("Мужские брюки размера " + size + " ,стоимостью " + prise + " ,цвета " + color);
    }
    public void clotheAWoman(){
        System.out.println("Женские брюки размера " + size + " ,стоимостью " + prise + " ,цвета " + color);
    }
    @Override
    public String toString() {
        return "Брюки размера " + size + " ,стоимостью " + prise + " ,цвета " + color;
    }
}
