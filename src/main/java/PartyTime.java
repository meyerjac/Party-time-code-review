

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

  public boolean isWedding(String weddingResponse) {
    if (weddingResponse == "yes") {
      return true;
    } else {
      return false;
    }
  }
  public int getBaseCostForPeople(Integer mpeople) {
      return (mpeople * 10); /* $10 base cost per person*/
    }

  public int getNumberOfHours(Integer mhours) {
      return (mhours * 2); /* there is a fee per hour for different venues*/
    }

  public int whichFoodPackage (String foodResponse) {
    mPeople = 100;
    if (foodResponse == "panda") {
      return (mPeople * 15);
    } else if (foodResponse == "fogoDeChao") {
      return (mPeople * 50);
    } else return mPeople * 10;

  }
}
