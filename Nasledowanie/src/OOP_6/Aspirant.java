package OOP_6;

public class Aspirant extends Student{
    String scientificWork;

    public Aspirant(String firstName, String lastName, String group, double averageMark, String scientificWork) {
        super(firstName, lastName, group, averageMark);
        this.scientificWork = scientificWork;
    }
    public String getScientificWork() {
        return scientificWork;
    }
    public void setScientificWork(String scientificWork) {
        this.scientificWork = scientificWork;
    }
    public int getScholarship(){
        int scholarship = 0;
        if (getAverageMark() == 5.00){
            scholarship = 200;
        }
        else {
            scholarship = 180;
        }
        return scholarship;
    }
}
