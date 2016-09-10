public class PartyTime {
  private String mType;
  private String mLocation;
  private String mFood;
  private String mDrink;
  private int mPeople;
  private int mHours;


  public PartyTime(String type, String location, String food, String drink, int people, int hours) {
    mType = type;
    mPeople = people;
    mHours = hours;
    mLocation = location;
    mFood = food;
    mDrink = drink;
  }

  public boolean isWedding(String weddingResponse) {
    if (weddingResponse == "yes") {
      return true;
    } else {
      return false;
    }
  }
}
