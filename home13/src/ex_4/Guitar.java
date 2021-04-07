package ex_4;

public class Guitar implements Instrument{
    int qString;

    Guitar(int qString){
        this.qString = qString;
    }

    @Override
    public void play() {
        System.out.println("Играет гитара с "+ qString + " струнами");
    }
}
