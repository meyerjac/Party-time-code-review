import org.junit.*;
import static org.junit.Assert.*;
import java.util.List;
import java.util.ArrayList;

public class PartyTimeTest {

  @Test
    public void NewPartyTime_instantiates_true(){
      PartyTime testPartyTime = new PartyTime("wedding", 0, 0, "fogo", "openbar", "hawaii");
      boolean outcome = true;
      assertEquals(outcome, testPartyTime instanceof PartyTime);
    }

  @Test
    public void NewPartyTime_WhatTypeOfEventIsIt_wedding(){
      PartyTime testPartyTime = new PartyTime("wedding", 0, 0, "fogo", "openbar", "hawaii");
      int outcome = 10000;
      assertEquals(outcome, testPartyTime.getType("wedding"));
    }

  @Test
    public void NewPartyTime_BaseCostPeople_1000(){
      PartyTime testPartyTime = new PartyTime("wedding", 0, 0, "fogo", "openbar", "hawaii");
      int outcome = 1000;
      assertEquals(outcome, testPartyTime.getBaseCostForPeople(100));
    }

  @Test
    public void NewPartyTime_NumberOfHoursTheEventWillLast_8(){
      PartyTime testPartyTime = new PartyTime("wedding", 0, 0, "fogo", "openbar", "hawaii");
      int outcome = 8;
      assertEquals(outcome, testPartyTime.getNumberOfHours(8));
    }

  @Test
    public void NewPartyTime_calculateFoodPackagePerPerson_fogo(){
      PartyTime testPartyTime = new PartyTime("wedding", 0, 0, "fogo", "openbar", "hawaii");
      int outcome = 50;
      assertEquals(outcome, testPartyTime.GetFoodCostPerPerson("fogo"));
    }

  @Test
    public void NewPartyTime_calculateDrinkPackageCost_20(){
      PartyTime testPartyTime = new PartyTime("wedding", 0, 0, "fogo", "openbar", "hawaii");
      int outcome = 20;
      assertEquals(outcome, testPartyTime.GetDrinkCostPerPerson("yes"));
    }

  @Test
    public void NewPartyTime_calculateLocationCharge_20000(){
      PartyTime testPartyTime = new PartyTime("wedding", 0, 0, "fogo", "openbar", "hawaii");
      int outcome = 20000;
      assertEquals(outcome, testPartyTime.getLocation("spain"));
    }
  }
