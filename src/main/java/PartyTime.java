

public class PartyTime {
  private String mType;
  private String mLocation;
  private String mFood;
  private String mDrink;
  private int mPeople;
  private int mHours;

  public PartyTime(String type, String location, String food, String drink, int people, int hours) {
    mType = type;
    mLocation = location;
    mFood = food;
    mDrink = drink;
    mPeople = people;
    mHours = hours;
  }

  public boolean isWedding(String weddingResponse) {
    if (weddingResponse == "yes") {
      return true;
    } else {
      return false;
    }
  }
  public int getBaseCostPerPerson(Integer mpeople) {
      return (mpeople * 10); /* $10 base cost per person*/
    }

  // public int getBaseCostPerPerson(Integer mpeople) {
  //     return (mpeople * 10); /* $10 base cost per person*/
  //   }

  }
