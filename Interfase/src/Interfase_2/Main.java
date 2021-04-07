package Interfase_2;

public class Main {
    public static void main(String[] args) {
        Instrument[]instruments = new Instrument[3];
        instruments[0] = new Guitar(6);
        instruments[1] = new Drum(200);
        instruments[2] = new Trump(30);
        for(Instrument instrument : instruments){
            instrument.play();
        }
    }
}
