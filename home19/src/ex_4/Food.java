package ex_4;

public class Food {

    public void eat(){
        System.out.println("Это еда");
    }

     Apple ap = new Apple() {
        public void clean(){
            System.out.println("Помыть яблоко");
        }
        @Override
        public void eat(){
            System.out.println("Это фрукт - яблоко");
        }
    };
}
