import org.junit.*;
import static org.junit.Assert.*;
import java.util.List;
import java.util.ArrayList;

public class PartyTimeTest {

  @Test
    public void NewPartyTime_instantiates_correctly(){
      PartyTime testPartyTime = new PartyTime("a", "a", "a", "c", 1992, 100);
      boolean outcome = true;
      assertEquals(outcome, testPartyTime instanceof PartyTime);
    }

  @Test
    public void NewPartyTime_determinesIfItIsAWeddingOrNot_true(){
      PartyTime testPartyTime = new PartyTime("a", "a", "a", "c", 1992, 100);
      boolean outcome = true;
      assertEquals(outcome, testPartyTime.isWedding("yes"));
    }

    @Test
      public void NewPartyTime_determinesIfItIsAWeddingOrNot_true(){
        PartyTime testPartyTime = new PartyTime("a", "a", "a", "c", 1992, 100);
        boolean outcome = true;
        assertEquals(outcome, testPartyTime.isWedding("yes"));
      }

      @Test
        public void NewPartyTime_determinesIfItIsAWeddingOrNot_true(){
          PartyTime testPartyTime = new PartyTime("a", "a", "a", "c", 1992, 100);
          boolean outcome = true;
          assertEquals(outcome, testPartyTime.isWedding("yes"));
        }
  }
