package ex_1;

public enum Seasons {
    SUMMER ("Жарко и можно купаться",18.5 ){
        @Override
        void getDeskription() {
            System.out.println("Теплое время года");
        }
    },
    FALL("Прохладно и падают листья", 6.6),
    WINTER("Холодно и идет снег",-8.8),
    SPRING("Тепло и солнечно",12.5);
String info;
double temp;
Seasons(String info){
    this.info = info;
}
    Seasons(String info,double temp){
        this.info = info;
        this.temp = temp;
    }
    @Override
    public String toString() {
        return "Информация о поре года: " + info + " Средняя температура : " + temp;
    }

    public static void iLike(Seasons season){
    switch (season){
        case SUMMER:
            System.out.println("Я люблю лето!");
            break;
        case FALL:
            System.out.println("Я люблю осень!");
            break;
        case WINTER:
            System.out.println("Я люблю зиму!");
            break;
        case SPRING:
            System.out.println("Я люблю весну!");
            break;
        default:
            System.out.println("Нет такой поры года!");
        }
    }
    void getDeskription(){
        System.out.println("Холодгое время года");
    }

}
