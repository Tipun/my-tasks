package ex_4;

public class Pipe implements Instrument{
    double diametr;

    public Pipe(double diametr) {
        this.diametr = diametr;
    }

    @Override
    public void play() {
        System.out.println("Играет труба с диаметром " + diametr);
    }
}
