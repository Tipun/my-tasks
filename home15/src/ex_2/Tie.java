package ex_2;

class Tie extends Clothes implements ManClothe{
    Tie(Size size,double prise,String color){
        super(size,prise,color);
    }
    public void clotheAMan(){
        System.out.println("Мужской галстук размера " + size + " ,стоимостью " + prise + " ,цвета " + color);
    }
    @Override
    public String toString() {
        return "Юбка размера " + size + " ,стоимостью " + prise + " ,цвета " + color;
    }
}
