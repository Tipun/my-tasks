package ex_6;

public class Triangle {
   private final double cat1 = 5.5;
   private final double cat2 = 3.3;

   public double area(){
       return cat1 * cat2 / 2;
   }
    public double hypotenuse(){
        return Math.sqrt(cat1 * cat1 + cat2 * cat2);
    }
    public double perimetr(){
        return cat1 + cat2 + hypotenuse();
    }
}
