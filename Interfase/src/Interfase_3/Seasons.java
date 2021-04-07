package Interfase_3;

public enum Seasons {
    SPRING("Тепло и солнично", "Весна",17),
    SUMMER("Очень тепло и можно купаться", "Лето", 23),
    OUTUMN("Прохладно и дождливо", "Осень",8),
    WINTER("Холодно,снег и лед", "Зима", -8);
    private String deskription;
    private String name;
    private double averegeTemperature;

    Seasons(String deskription, String name, double averegeTemperature) {
        this.deskription = deskription;
        this.name = name;
        this.averegeTemperature = averegeTemperature;
    }

    public String getDeskription() {
        return deskription;
    }

    public static void love(Seasons season) {
        switch (season) {
            case SPRING:
                System.out.println("Я люблю " + season.name + " описание " + season.deskription + " средняя температура " + season.averegeTemperature);
                break;
            case SUMMER:
                System.out.println("Я люблю " + season.name + " описание " + season.deskription + " средняя температура " + season.averegeTemperature);
                break;
            case OUTUMN:
                System.out.println("Я люблю " + season.name + " описание " + season.deskription + " средняя температура " + season.averegeTemperature);
                break;
            case WINTER:
                System.out.println("Я люблю " + season.name + " описание " + season.deskription + " средняя температура " + season.averegeTemperature);
                break;
        }
    }
    public void getDeskriptions(Seasons season){
        if(season == Seasons.WINTER)
        System.out.println("Холодное время года");
        else
            System.out.println("Теплое время года");
    }
}
