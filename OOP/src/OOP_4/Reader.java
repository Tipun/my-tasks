package OOP_4;

import java.util.Calendar;

public class Reader {
    String fIO;
    int numberOfBilet;
    String fakult;
    Calendar dateBirth;
    int numberTel;
    Reader (String fIO,int numberOfBilet,String fakult,Calendar dateBirth,int numberTel){
        this.fIO = fIO;
        this.numberOfBilet = numberOfBilet;
        this.fakult = fakult;
        this.dateBirth = dateBirth;
        this.numberTel = numberTel;
    }
    public String getfIO() {
        return fIO;
    }

    public void setfIO(String fIO) {
        this.fIO = fIO;
    }

    public int getNumberOfBilet() {
        return numberOfBilet;
    }

    public void setNumberOfBilet(int numberOfBilet) {
        this.numberOfBilet = numberOfBilet;
    }

    public String getFakult() {
        return fakult;
    }

    public void setFakult(String fakult) {
        this.fakult = fakult;
    }

    public Calendar getDateBirth() {
        return dateBirth;
    }

    public void setDateBirth(Calendar dateBirth) {
        this.dateBirth = dateBirth;
    }

    public int getNumberTel() {
        return numberTel;
    }

    public void setNumberTel(int numberTel) {
        this.numberTel = numberTel;
    }
    public void takeBook(){
        System.out.println("Книга выдана");
    }
    public void returnBook(){
        System.out.println("Книга возвращена");
    }
    public void takeBook(int kol){
        System.out.println(fIO + " взял(-а) " + kol + " книги");
    }
    public void takeBook(String...Book){
        String B = "";
        for (String s : Book) {
            B += s + ", ";

        }
        B = B.substring(0,B.length()-2);
        B = B + ".";
        System.out.println(fIO + " взял(-а) книги: " + B);
    }
    public void returnBook(String...books){
        String B = "";
        for (String book : books) {
            B += book +", ";
        }
        B = B.substring(0,B.length()-2);
        B = B + ".";
        System.out.println(fIO + " вернул(-а) книги: " + B);
    }
}
