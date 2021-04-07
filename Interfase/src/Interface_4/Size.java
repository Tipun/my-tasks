package Interface_4;

import java.sql.SQLOutput;

public enum Size {
    XXS(32),
    XS(34),
    S(36),
    M(38),
    L(40);

    private int euroSize;

    Size(int euroSize){
        this.euroSize = euroSize;
    }
    public int getEuroSize(){
        return euroSize;
    }
    public void setEuroSize(int euroSize){
        this.euroSize = euroSize;
    }
    public void getDeskription(Size size) {
        switch (size) {
            case XXS:
                System.out.println("Детский размер");
            case XS:
                System.out.println("Взрослый размер");
            case S:
                System.out.println("Взрослый размер");
            case M:
                System.out.println("Взрослый размер");
            case L:
                System.out.println("Взрослый размер");
        }
    }


}
