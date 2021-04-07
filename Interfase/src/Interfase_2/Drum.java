package Interfase_2;

public class Drum implements Instrument {
    private int size;

    Drum(int size){
        this.size = size;
    }
    public int getSize(){
        return size;
    }
    public void setSize(int size){
        this.size = size;
    }
    public void play(){
        System.out.println("Барабан с разменом " + size + " мм.");
    }

}
