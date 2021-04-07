package ex_2;

import java.util.ArrayList;

public class publicclassSolution {
    public static LittleRedRidingHood hood = new LittleRedRidingHood();
    public static Grandmother grandmother = new Grandmother();
    public static Patty patty = new Patty();
    public static Woodman woodman = new Woodman();
    public static Wolf wolf = new Wolf();

    public static void main(String[] args) {
        // Напишите тут ваш код
        wolf.ate.add(grandmother);
        wolf.ate.add(hood);
        woodman.killed.add(wolf);
    }
}
class LittleRedRidingHood extends StoryItem {
}

//бабушка
 class Grandmother extends StoryItem {
}

//пирожок
 class Patty  extends StoryItem{
}

//дровосек
 class Woodman extends StoryItem {
}

//волк
 class Wolf extends StoryItem {
}

 abstract class StoryItem {
    public ArrayList<StoryItem> killed = new ArrayList<StoryItem>();
    public ArrayList<StoryItem> ate = new ArrayList<StoryItem>();
}
