import org.junit.*;
import static org.junit.Assert.*;
import java.util.ArrayList;
import java.util.List;

public class PartyTimeTest {

  @Test
    public void isNewEvent_Created_true(){
      PartyTime testEvent = new PartyTime();
      boolean outcome = true;
      assertEquals(outcome, test.isNewevent());
    }
}
