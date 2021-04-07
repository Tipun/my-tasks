package Interfase_2;

public class Trump implements Instrument {
    private int diametr;
    Trump(int diametr){
        this.diametr = diametr;
    }
    public int getDiametr(){
        return diametr;
    }
    public void setDiametr(int diametr){
        this.diametr = diametr;
    }
    public void play(){
        System.out.println("Играет труба с диаметром " + diametr + " мм.");
    }
}
