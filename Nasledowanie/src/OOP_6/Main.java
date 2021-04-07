package OOP_6;

public class Main {
    public static void main(String[] args) {
        Student st1 = new Aspirant("Максим", "Типун", "КП-14", 5.00, "Интерфейсы");
        Student[] students = new Student[4];
        Student st2 = new Aspirant("Александр", "Типун", "Гео-8", 4.58, "Инкапсуляция");
        Student st3 = new Student("Тамара", "Типун", "Пед-7", 5.00);
        Student st4 = new Student("Анатолий", "Типун", "Мил-3", 4.00);
        students[0] = st1;
        students[1] = st2;
        students[2] = st3;
        students[3] = st4;
        for (Student student : students) {
            System.out.println(student.getScholarship());
        }

    }
}

