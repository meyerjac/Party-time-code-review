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
      public void NewPartyTime_CostPerPerson_1000(){
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
  }
