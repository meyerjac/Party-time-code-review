import org.junit.*;
import static org.junit.Assert.*;
import java.util.List;
import java.util.ArrayList;

public class PartyTimeTest {

  @Test
    public void NewEvent_instantiates_correctly(){
      Event testEvent = new Event("a", "a", "a", "c", 1992, 100);
      boolean outcome = true;
      assertEquals(outcome, testEvent instanceof Event);
    }
  }
