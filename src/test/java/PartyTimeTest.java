import org.junit.*;
import static org.junit.Assert.*;
import java.util.List;
import java.util.ArrayList;

public class PartyTimeTest {

  @Test
    public void NewPartyTime_instantiates_correctly(){
      PartyTime testPartyTime = new PartyTime("a", 1992, 100, "a", "a", "c");
      boolean outcome = true;
      assertEquals(outcome, testPartyTime instanceof PartyTime);
    }

  @Test
    public void NewPartyTime_determinesIfItIsAWeddingOrNot_true(){
      PartyTime testPartyTime = new PartyTime("a", 1992, 100, "a", "a", "c");
      boolean outcome = true;
      assertEquals(outcome, testPartyTime.isWedding("yes"));
    }

    @Test
      public void NewPartyTime_BaseCostForWeddingForPeople_1000(){
        PartyTime testPartyTime = new PartyTime("a", 1992, 100, "a", "a", "c");
        int outcome = 1000;
        assertEquals(outcome, testPartyTime.getBaseCostForPeople(100));
      }

    @Test
      public void NewPartyTime_CalculatesHourlyFee_8(){
        PartyTime testPartyTime = new PartyTime("a", 1992, 100, "a", "a", "c");
        int outcome = 8;
        assertEquals(outcome, testPartyTime.getNumberOfHours(4));
      }

    @Test
      public void NewPartyTime_calculateFoodPackageCost_fogoDeChao(){
        PartyTime testPartyTime = new PartyTime("a", 100, 4, "panda", "a", "c");
        int outcome = 5000;
        assertEquals(outcome, testPartyTime.whichFoodPackage("fogoDeChao"));
      }

    @Test
      public void NewPartyTime_calculateDrinkPackageCost_20(){
        PartyTime testPartyTime = new PartyTime("a", 100, 4, "panda", "yes", "c");
        int outcome = 2000;
        assertEquals(outcome, testPartyTime.whichDrinkPackage("yes"));
      }

    @Test
      public void NewPartyTime_calculateLocationCharge_20000(){
        PartyTime testPartyTime = new PartyTime("a", 100, 4, "panda", "yes", "c");
        int outcome = 20000;
        assertEquals(outcome, testPartyTime.whichLocation("spain"));
      }
  }
