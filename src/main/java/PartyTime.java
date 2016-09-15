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

  public String getType() {
    return mType;
  }
  public int getPeople() {
    return mPeople;
  }
  public int getHours() {
    return mHours;
  }
  public String getFood() {
    return mFood;
  }
  public String getDrink () {
    return mDrink;
  }
  public String getLocation() {
    return mLocation;
  }

  public int typeTotal() {
    Integer typetotal = 0;
    if (mType.equals("birthday") || mType.equals("other")) {
      typetotal += 2000;
    } else if (mType.equals("wedding")) {
      typetotal += 5000;
    } else {
      typetotal += 1000;
    }
    return typetotal;
  }
  public int foodTotal() {
    Integer foodtotal = 0;
    if (mFood.equals("fogo")) {
      foodtotal += (50 * mPeople);
      return foodtotal;
    } else if (mFood.equals("panda")) {
      foodtotal += (20 * mPeople);
      return foodtotal;
    } else if (mFood.equals("mcdonalds")) {
      foodtotal += (10 * mPeople);
      return foodtotal;
    }  else {
      foodtotal +=500;
      return foodtotal;
    }
  }
  public int barTotal() {
    Integer bartotal = 0;
    if (mDrink.equals("yes")) {
      bartotal = (mPeople * 20);
      return bartotal;
    } else if (mDrink.equals("no")) {
      bartotal += 200;
      return bartotal;
    } else {
      bartotal += 50;
      return bartotal;
    }
  }
  public int locationTotal() {
    Integer locationtotal = 0;
    if (mLocation.equals("spain") || mLocation.equals("hawaii")) {
      locationtotal += 15000;
      return locationtotal;
    } else if (mLocation.equals("nearby")) {
      locationtotal += 5000;
      return locationtotal;
    } else {
      locationtotal += 200;
      return locationtotal;
    }
  }

  public int TotalTotal() {
    Integer totaltotal = 0;
    if (mType.equals("birthday") || mType.equals("other")) {
      totaltotal += 2000;
    } else if (mType.equals("wedding")) {
      totaltotal += 5000;
    } else {
      totaltotal += 1000;
    }
    if (mFood.equals("fogo")) {
      totaltotal += (50 * mPeople);
    } else if (mFood.equals("panda")) {
      totaltotal += (20 * mPeople);
    } else if (mFood.equals("mcdonalds")) {
      totaltotal += (10 * mPeople);
    }  else {
      totaltotal += 500;
    }
    if (mDrink.equals("yes")) {
      totaltotal += (mPeople * 20);
    } else if (mDrink.equals("no")) {
      totaltotal += 200;
    } else {
      totaltotal += 50;
    }
    if (mLocation.equals("spain") || mLocation.equals("hawaii")) {
      totaltotal += 15000;
    } else if (mLocation.equals("nearby")) {
      totaltotal += 5000;
    } else {
      totaltotal += 200;
    }
    return totaltotal;
  }

}
