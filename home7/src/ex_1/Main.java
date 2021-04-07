package ex_1;

public class Main {


    public static void main(String[] args) {
        String [][][]rubic = new String[6][5][5];
        for (int stor = 0; stor < 6; stor++) {
            for (int i = 0; i < 5; i++) {
                for (int j = 0; j < 5; j++) {
                    if(stor == 0){
                        rubic[stor][i][j] = "Красный";
                    }
                    if(stor == 1){
                        rubic[stor][i][j] = "Синий";
                    }
                    if(stor == 2){
                        rubic[stor][i][j] = "Зеленый";
                    }
                    if(stor == 3){
                        rubic[stor][i][j] = "Желтый";
                    }
                    if(stor == 4){
                        rubic[stor][i][j] = "Оранжевый";
                    }
                    if(stor == 5){
                        rubic[stor][i][j] = "Фиолетовый";
                    }
                }
            }
        }
        System.out.println(rubic[1][3][4]);
        System.out.println(rubic[3][0][2]);
    }
}
