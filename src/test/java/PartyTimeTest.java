import org.junit.*;
import static org.junit.Assert.*;

public class PartyTimeTest {

  @Test
  public void NewPartyTime_instantiates_true(){
    PartyTime testPartyTime = new PartyTime("wedding", 10, 10, "fogo", "yes", "hawaii");
    assertEquals(true, testPartyTime instanceof PartyTime);
  }
  @Test
  public void NewPartyTime_WhatTypeOfEventIsIt_wedding(){
    PartyTime testPartyTime = new PartyTime("wedding", 10, 10, "fogo", "yes", "hawaii");
    assertEquals("wedding", testPartyTime.getType());
  }
  @Test
  public void NewPartyTime_BaseCostPeople_1000(){
    PartyTime testPartyTime = new PartyTime("wedding", 10, 10, "fogo", "yes", "hawaii");
    assertEquals(10, testPartyTime.getPeople());
  }
  @Test
  public void NewPartyTime_NumberOfHoursTheEventWillLast_8(){
    PartyTime testPartyTime = new PartyTime("wedding", 10, 10, "fogo", "yes", "hawaii");
    assertEquals(10, testPartyTime.getHours());
  }

  @Test
  public void NewPartyTime_gettingFoodCostPerPerson_fogo(){
    PartyTime testPartyTime = new PartyTime("wedding", 10, 10, "fogo", "yes", "hawaii");
    assertEquals("fogo", testPartyTime.getFood());
  }

  @Test
  public void NewPartyTime_gettingDrinkCostPerPerson_openbar(){
    PartyTime testPartyTime = new PartyTime("wedding", 10, 10, "fogo", "yes", "hawaii");
    assertEquals("yes", testPartyTime.getDrink());
  }

  @Test
  public void NewPartyTime_gettingTheLocationCharge_20000(){
    PartyTime testPartyTime = new PartyTime("wedding", 10, 10, "fogo", "yes", "hawaii");
    assertEquals("hawaii", testPartyTime.getLocation());
  }
  @Test
  public void NewPartyTime_returningThetypeTotal_0(){
    PartyTime testPartyTime = new PartyTime("birthday", 10, 10, "fogo", "yes", "hawaii");
    assertEquals(2000, testPartyTime.typeTotal());
  }
  @Test
  public void NewPartyTime_returningThefoodTotal_0(){
    PartyTime testPartyTime = new PartyTime("birthday", 10, 10, "fogo", "yes", "hawaii");
    assertEquals(500, testPartyTime.foodTotal());
  }
  @Test
  public void NewPartyTime_returningTheBarTotal_2000(){
    PartyTime testPartyTime = new PartyTime("birthday", 10, 10, "fogo", "yes", "hawaii");
    assertEquals(200, testPartyTime.barTotal());
  }
  @Test
  public void NewPartyTime_returningTheLocationTotal_15000(){
    PartyTime testPartyTime = new PartyTime("birthday", 10, 10, "fogo", "yes", "hawaii");
    assertEquals(15000, testPartyTime.locationTotal());
  }
  @Test
  public void NewPartyTime_returningTheTotalTotal_15000(){
    PartyTime testPartyTime = new PartyTime("birthday", 10, 10, "fogo", "yes", "hawaii");
    assertEquals(17700, testPartyTime.TotalTotal());
  }
}
