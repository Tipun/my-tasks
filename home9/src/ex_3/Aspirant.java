package ex_3;

public class Aspirant extends Student{
    String scientificWork;

    @Override
    int getScholarship() {
        if(this.averageMark == 5){
            return 200;
        }
        else{
            return 180;
        }
    }
}
