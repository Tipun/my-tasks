package ex_1onlesson;

public class Main {
    public static void main(String[] args) {
        Train tr1 = new Train("Moscow", 555, 2.11);
        Train tr2 = new Train("Minsk", 444, 3.33);
        Train tr3 = new Train("Warshaw", 333, 5.25);
        Train tr4 = new Train("Kiev", 222, 7.40);
        Train tr5 = new Train("Vilnus", 111, 10.20);

        // tr1.info();

        Train[]trains = new Train[5];
        trains[0] = tr1;
        trains[1] = tr2;
        trains[2] = tr3;
        trains[3] = tr4;
        trains[4] = tr5;
        for (int i = 0; i < trains.length; i++) {
            int min = trains[i].NumberTrain;
            int min_i = i;
            for (int j = i + 1; j < trains.length ; j++) {
                if(trains[j].NumberTrain < min){
                    min = trains[j].NumberTrain;
                    min_i = j;
                }
            }
            if(i != min_i){
                int tmp = trains[i].NumberTrain;
                trains[i].NumberTrain = trains[min_i].NumberTrain;
                trains[min_i].NumberTrain = tmp;
            }
        }
        for (int i = 0; i < trains.length; i++) {
            trains[i].info();
        }



    }
}
