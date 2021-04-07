package OOP_1;

public class Phone {
     int number;
     String model;
     double weight;
    public void setNumber(int number){
        this.number = number;
    }
    public int getNumber(){
        return number;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getModel() {
        return model;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public  Phone(){

    }
    public Phone(int number, String model, double weight) {
        this(number, model);
        this.weight = weight;
    }

    public Phone(int number, String model) {
        this.number = number;
        this.model = model;
    }

    //    public String toString (){
//        return "phone : \n" + "number = " + number + "\nmodel = " + model + "\nweight = " + weight;
//    }
    public  void reciveCall(String name){
        System.out.println("Звонит {" + name + "}");
    }
    public void getNumberTwo(){
        System.out.println(number);
    }
    public static void reciveCall(String name,int number){
        System.out.println("Звонит {" + name + "}, number {" + number + "}");
    }
    public void sendMessage(int...numbers){
        System.out.println("Сообщения отправлены по номерам:");
        for (int number : numbers) {
            System.out.println(number);
        }
    }
}
