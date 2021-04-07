package Interfase_2;

public class Guitar implements Instrument {
    private int qantityString;
    public Guitar(int qantityString) {
        this.qantityString = qantityString;
    }
    public int getQantityString(){
        return qantityString;
    }
    public void setQantityString(int qantityString){
        this.qantityString = qantityString;
    }
    public void play(){
        System.out.println("Играет гитара с количеством струн " + qantityString);
    }
}
