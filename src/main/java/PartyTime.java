class Event {
  public String mType;
  public String mLocation;
  public String mFood;
  public String mDrink;
  public int mPeople;
  public int mHours;


  public Event(String type, String location, String food, String drink, int people, int hours) {
  mType = type;
  mPeople = people;
  mHours = hours;
  mLocation = location;
  mFood = food;
  mDrink = drink;
  }

  public boolean isWedding(String weddingResponse) {
    return(true);
}
}
