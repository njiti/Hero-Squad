import java.util.ArrayList;
import java.util.List;

public class Hero {
    private String Name;
    private String Age;
    private String Strength;
    private String Weakness;
    private static List<Hero> instances = new ArrayList<Hero>();
    private int mId;

    public Hero(String name, String age, String power, String weakness){
        Name = name;
        Age = age;
        Strength = power;
        Weakness = weakness;
        instances.add(this);
        mId = instances.size();
    }

    public String getName(){
        return Name;
    }
    public String getAge(){
        return Age;
    }
    public String getPower(){
        return Strength;
    }
    public String getWeakness(){
        return Weakness;
    }
    public static List<Hero> all(){
        return instances;
    }
    public static void clear(){
        instances.clear();
    }
    public int getId(){
        return mId;
    }
    public static Hero find(int id) {
        return instances.get(id - 1);
    }

}
