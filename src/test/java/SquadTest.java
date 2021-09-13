//import org.junit.*;
//import static org.junit.Assert.*;
//
//public class SquadTest {
//    @Test
//    public void If_squad_instantiatesCorrectly_true() {
//        Squad squad = new Squad("Moringa", "Making coders", "30");
//        assertTrue(squad instanceof Squad);
//    }
//    @Test
//    public void If_squad_instantiatesWithName_String() {
//        Squad squad = new Squad("Moringa", "Making coders", "30");
//        assertEquals("Moringa", squad.getName());
//    }
//    @Test
//    public void If_squad_instantiatesWithCause_String() {
//        Squad squad = new Squad("Moringa", "Making coders", "30");
//        assertEquals("Making coders", squad.getCause());
//    }
//    @Test
//    public void If_squad_instantiatesWithMaximum_String() {
//        Squad squad = new Squad("Moringa", "Making coders", "30");
//        assertEquals("30", squad.getMax());
//    }
//    @Test
//    public void If_returnsAllInstancesOfSquad_true() {
//        Squad squad = new Squad("Moringa", "Making coders", "30");
//        Squad squadTwo = new Squad("Squad", "Win the league", "11");
//        assertEquals(true, Squad.all().contains(squad));
//        assertEquals(true, Squad.all().contains(squadTwo));
//    }
//    @Test
//    public void If_clear_AllSquadsFromList_0() {
//        Squad squadTwo = new Squad("Squad", "Win the league", "11");
//        Squad.clear();
//        assertEquals(Squad.all().size(), 0);
//    }
//    @Test
//    public void If_getId_squadsInstantiateWithAnId_6() {
//        Squad squad = new Squad("Squad", "Win the league", "11");
//        assertEquals(5, squad.getId());
//    }
//    @Test
//    public void If_find_returnsSquadWithSameId_secondSquad() {
//        Squad.clear();
//        Squad squad = new Squad("Moringa", "Making coders", "30");
//        Squad squadTwo = new Squad("Squad", "Win the league", "11");
//        assertEquals(Squad.find(squadTwo.getId()), squadTwo);
//    }
//    @Test
//    public void If_getTasks_initiallyReturnsEmptyList_ArrayList() {
//        Squad.clear();
//        Squad squadTwo = new Squad("Squad", "Win the league", "11");
//        assertEquals(0, squadTwo.getHeroes().size());
//    }
//    @Test
//    public void If_addTask_addsTaskToList_true() {
//        Squad squadTwo = new Squad("Squad", "Win the league", "11");
//        Hero hero = new Hero("batman","39","Strength", "Superman");
//        squadTwo.addHero(hero);
//        assertTrue(squadTwo.getHeroes().contains(hero));
//    }
//}