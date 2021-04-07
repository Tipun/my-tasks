package ex_1;

public class Main {
    public static void main(String[] args) {

    Phone phone1 = new Phone();
    Phone phone2 = new Phone();
    Phone phone3 = new Phone();

    Phone[]phones = new Phone[3];
    phones[0] = phone1;
    phones[1] = phone2;
    phones[2] = phone3;

    phone1.number = 7123456;
    phone2.number = 6123456;
    phone3.number = 5123456;
    phone1.model = "Xiaomi";
    phone2.model = "Samsung";
    phone3.model = "Nokia";
    phone1.weigth = 100.25;
    phone2.weigth = 80.75;
    phone3.weigth = 75.55;
        for (int i = 0; i < phones.length; i++) {
            System.out.println("Телефон № " + (i + 1) + " : " + " модель - " + phones[i].model + ", номер - "
                    + phones[i].number + ", вес - " + phones[i].weigth + " грамм");
        }
        phone1.receiveCall("Максим");
        phone2.receiveCall("Инна");
        phone2.receiveCall("Федор");
        for (Phone phone : phones) {
            System.out.println(phone.getNumber());
        }
    }
}
