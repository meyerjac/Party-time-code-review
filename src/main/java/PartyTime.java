public class PartyTime {
  public String mType;
  public int mPeople;
  public int mHours;
  public String mFood;
  public String mDrink;
  public String mLocation;


  public PartyTime(String type, int people, int hours , String food, String drink, String location) {
    mType = type;
    mPeople = people;
    mHours = hours;
    mFood = food;
    mDrink = drink;
    mLocation = location;
  }

  public boolean isWedding(String weddingResponse) {
    if (weddingResponse.equals("yes")) {
      return true;
    } else {
      return false;
    }
  }
  public int getBaseCostForPeople(Integer mPeople) {
      return (mPeople * 10); /* $10 base cost per person*/
    }

  public int getNumberOfHours(Integer mHours) {
      return (mHours * 2); /* there is a fee per hour for different venues*/
    }

  public int whichFoodPackage (String foodResponse, int numberOfPeople) {
    if (foodResponse.equals("panda")) {
      return (numberOfPeople * 15);
    } else if (foodResponse.equals("fogo")) {
      return (numberOfPeople * 50);
    } else return numberOfPeople * 10;
  }

  public int whichDrinkPackage (String drinkResponse, int numberOfPeople) {
    if (drinkResponse.equals("yes")) {
      return (numberOfPeople * 20);
    } else if (drinkResponse.equals("no")) {
      return (0);
    } else {
      return (0);
    }
  }

  public int whichLocation (String locationResponse) {
    if (locationResponse.equals("hawaii")) {
      return (10000);
    } else if (locationResponse.equals("california")) {
      return (5000);
    } else if (locationResponse.equals("spain")) {
      return (20000);
    } else {return 0;
    }
    }


  }
