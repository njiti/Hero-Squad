import java.util.ArrayList;
import java.util.List;

public class Squad {
    private String Name;
    private String Cause;
    private String Maximum;
    private static List<Squad> instances = new ArrayList<>();
    private int mId;
    private List<Hero> mHeroes;

    public Squad(String name, String cause, String maximum){
        Name = name;
        Cause = cause;
        Maximum = maximum;
        instances.add(this);
        mId = instances.size();
        mHeroes = new ArrayList<Hero>();

    }

    public String getName(){
        return Name;
    }

    public String getCause(){
        return Cause;
    }

    public String getMax(){
        return Maximum;
    }

    public static List<Squad> all() {
        return instances;
    }

    public static void clear() {
        instances.clear();
    }

    public int getId() {
        return mId;
    }

    public static Squad find(int id) {
        return instances.get(id - 1);
    }

    public List<Hero> getHeroes() {
        return mHeroes;
    }

    public void addHero(Hero hero) {
        mHeroes.add(hero);
    }
}
