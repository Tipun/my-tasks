package Interface_4;

public class Studios {


    public static void dressAMan(Clothing[]cloth) {
        for(Clothing c : cloth){
            if(c instanceof Tshirt || c instanceof Pants || c instanceof Tie){
                System.out.println("Одет " + c.getSize() + " размера " + c.getColor() + " цвета " + ",стоимостью " + c.getCost());
            }
        }

    }

    public static void dressAWoman(Clothing[]cloth) {
        for(Clothing c : cloth){
            if(c instanceof Tshirt || c instanceof Pants || c instanceof Skirt){
                System.out.println("Одет " + c.getSize() + " размера " + c.getColor() + " цвета " + ",стоимостью " + c.getCost());
            }
        }

    }


}
