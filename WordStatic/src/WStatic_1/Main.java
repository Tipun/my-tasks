package WStatic_1;

public class Main {
    public static void main(String[] args) {
    Phone phone1 = new Phone(7959275, "xiaomi",120);
    Phone phone2 = new Phone(7959273, "samsung",105);
    Phone phone3 = new Phone(7952564, "veon",100);
        System.out.println("Количество созданных телефонов " + Phone.getCount());
    }
}
