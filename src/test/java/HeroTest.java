import org.junit.*;
import static org.junit.Assert.*;

public class HeroTest {
    @Test
    public void If_heroinstantiatesCorrectly_true() {
        Hero hero = new Hero("","","","");
        assertTrue(hero instanceof Hero);
    }
    @Test
    public void If_hero_instantiatesWithName_String() {
        Hero hero = new Hero("Superman","32","all","cryptonite");
        assertEquals("Superman", hero.getName());
    }
    @Test
    public void If_hero_instantiatesWithAge_int() {
        Hero hero = new Hero("Superman","32","all","cryptonite");
        assertEquals("32", hero.getAge());
    }
    @Test
    public void If_Hero_instantiatesWithPower_String() {
        Hero hero = new Hero("Superman","32","all","cryptonite");
        assertEquals("all", hero.getPower());
    }
    @Test
    public void If_Hero_instantiatesWithWeakness_String() {
        Hero hero = new Hero("Superman","32","all","cryptonite");
        assertEquals("cryptonite", hero.getWeakness());
    }
    @Test
    public void If_allAllInstancesOfHero_are_true(){
        Hero heroOne = new Hero("batman","39","Strength", "Superman");
        Hero heroTwo = new Hero("Ronaldo","35","speed", "messi");
        assertTrue(Hero.all().contains(heroOne));
        assertTrue(Hero.all().contains(heroTwo));
    }
    @Test
    public void clear_AllHeroesFromArrayList_0() {
        Hero hero = new Hero("batman","39","Strength", "Superman");
        Hero.clear();
        assertEquals(Hero.all().size(), 0);
    }
    @Test
    public void getId_heroesInitiateWithAnID_1(){
        Hero.clear();
        Hero hero = new Hero("batman","39","Strength", "Superman");
        assertEquals(1, hero.getId());
    }
    @Test
    public void find_returnsHeroWithSameId_heroTwo() {
            Hero hero = new Hero("batman","39","Strength", "Superman");
        Hero heroTwo = new Hero("Ronaldo","35","speed", "messi");
        assertEquals(Hero.find(heroTwo.getId()), heroTwo);
    }
}
