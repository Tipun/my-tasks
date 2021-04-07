package ex_4;

public class Main {
    public static void main(String[] args) {
       Instrument[] instruments = new Instrument[6];
       instruments[0] = new Guitar(7);
       instruments[1] = new Guitar(6);
       instruments[2] = new Drum(100);
       instruments[3] = new Drum(120);
       instruments[4] = new Pipe(10);
       instruments[5] = new Pipe(14);

        for(Instrument in : instruments){
            in.play();
        }
    }
}
