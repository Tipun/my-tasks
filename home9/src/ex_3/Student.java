package ex_3;

public class Student {
    String firstName;
    String lastName;
    String group;
    double averageMark;

    int getScholarship(){
        if(this.averageMark == 5){
            return 100;
        }
        else{
            return 80;
        }

    }
}
