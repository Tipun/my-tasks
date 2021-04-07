package ex_3;

public class Main {
    public static void main(String[] args) {
        Student aspirant1 = new Aspirant();
        aspirant1.firstName = "Иван";
        aspirant1.lastName = "Иванов";
        aspirant1.group = "СМ - 8";
        aspirant1.averageMark = 5;
        System.out.println(aspirant1.getScholarship());

    }
}
