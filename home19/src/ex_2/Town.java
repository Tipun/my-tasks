package ex_2;

public class Town {
    private String townName;
    Town(String townName){
        this.townName = townName;
    }
    private String getTownName(){
        return townName;
    }

    class Street {
        private int index;
        private String streetName;
        private int numberOfHouse;

        public Street(int index, String streetName, int numberOfHouse) {
            this.index = index;
            this.streetName = streetName;
            this.numberOfHouse = numberOfHouse;
        }
        public int getIndex() {
            return index;
        }
        public String getStreetName() {
            return streetName;
        }
        public int getNumberOfHouse() {
            return numberOfHouse;
        }
        public String toString(){
            return "Город " + getTownName() + "\nИндекс " + getIndex() + "\nНазвание улицы " + getStreetName() + "\nНомер дома " + getNumberOfHouse();
            }
    }
        public Street createStreet(int index, String streetName, int numberOfHouse) {
        Street s = new Street(index,streetName,numberOfHouse);
        return s;
        }


}
