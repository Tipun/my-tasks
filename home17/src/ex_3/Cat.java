package ex_3;

public class Cat extends Pat {
    private String vid = "Кот";
    private int age;
    private double heigth;
    Cat(String vid,double weiqht,int age,double heigth){
        super(weiqht);
        this.age = age;
        this.heigth = heigth;
        this.vid = vid;
    }
    public int getAge(){
        return age;
    }
    public void setAge(int age){
        this.age = age;
    }
    public double getHeigth(){
        return heigth;
    }
    public void setHeigth(double heigth){
        this.heigth = heigth;
    }
    public String getVid() {
        return vid;
    }
    public void setVid(String vid) {
        this.vid = vid;
    }


    @Override
    public java.lang.String toString() {
        java.lang.String s;
        s = "Животное : " + vid + ", вес : " + getWeiqht() + ", рост : " + heigth + ", возраст : " + age ;
        return s;
    }
}
