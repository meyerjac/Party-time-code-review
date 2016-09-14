public class PartyTime {
  private String mType;
  private int mPeople;
  private int mHours;
  private String mFood;
  private String mDrink;
  private String mLocation;

  public PartyTime(String type, int people, int hours , String food, String drink, String location) {
    mType = type;
    mPeople = people;
    mHours = hours;
    mFood = food;
    mDrink = drink;
    mLocation = location;
  }

  public int getType(String eventResponse) {
    if (eventResponse.equals("wedding")) {
      return 10000;
  } else if (eventResponse.equals("birthday")) {
      return 5000;
  } else if (eventResponse.equals("other")) {
    return 1000;
  } else return 0;
  }

  public int getBaseCostForPeople(Integer numberOfPeople) {
      return (numberOfPeople * 10); /* $10 base cost per person*/
  }

  public int getNumberOfHours(Integer numberOfHours) {
    return (numberOfHours);
  }

  public int GetFoodCostPerPerson (String foodResponse) {
    if (foodResponse.equals("panda")) {
      return (15);
    } else if (foodResponse.equals("fogo")) {
      return (50);
    } else
    return 10;
  }

  public int GetDrinkCostPerPerson (String drinkResponse) {
    if (drinkResponse.equals("yes")) {
      return (20);
    } else if (drinkResponse.equals("no")) {
      return (0);
    } else {
      return (0);
    }
  }

  public int getLocation (String locationResponse) {
    if (locationResponse.equals("hawaii")) {
      return (10000);
    } else if (locationResponse.equals("california")) {
      return (5000);
    } else if (locationResponse.equals("spain")) {
      return (20000);
    } else return 0;
  }
}
