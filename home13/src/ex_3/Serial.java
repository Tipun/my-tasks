package ex_3;

public class Serial implements Printable {
    String name;
    int quantityEpisods;
    Serial(String name,int quantityEpisods){
        this.name = name;
        this.quantityEpisods = quantityEpisods;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getQuantityEpisods() {
        return quantityEpisods;
    }

    public void setQuantityEpisods(int quantityEpisods) {
        this.quantityEpisods = quantityEpisods;
    }

    @Override
    public void print() {
        System.out.println("Сериал: " + name + " ,количество серий: " + quantityEpisods);
    }
    public static void printSerials(Printable[]printables){
        for(Printable p : printables){
            if (p instanceof Serial){
                System.out.println("Это Сериал: " + ((Serial)p).getName() + " ,количество серий: " + ((Serial)p).getQuantityEpisods());
            }
        }
    }
}
