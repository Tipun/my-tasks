package ex_1onlesson;

public class Train {
    String PunktNazn;
    int NumberTrain;
    double VremaOtpravlenija;

    Train(String PunktNazn,int NumberTrain,double VremaOtpravlenija){
        this.PunktNazn = PunktNazn;
        this.NumberTrain = NumberTrain;
        this.VremaOtpravlenija = VremaOtpravlenija;
    }
    void info(){
        System.out.println("Пункт назначения: " + PunktNazn + " ,Номер поезда " + NumberTrain + " ,Время отправления " + VremaOtpravlenija);
    }
}
