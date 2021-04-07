package ex_4;

public class Drum implements Instrument {
    double size;

    public Drum(double size) {
        this.size = size;
    }

    @Override
    public void play() {
        System.out.println("Играет барабан с размером " + size);
    }
}
