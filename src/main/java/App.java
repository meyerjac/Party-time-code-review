import java.io.Console;

public class App {
  public static void main(String[] args) {
    Console myConsole = System.console();


    PartyTime Event = new PartyTime("", 0,0,"","","");
    Event.mType = "";
    Event.mPeople = 0;
    Event.mHours = 0;
    Event.mFood = "";
    Event.mDrink = "";
    Event.mLocation = "";


    System.out.println("I am guessing you are here to plan an event, are you here to plan a wedding? (answer: yes or no)");
    String inputStringWedding = myConsole.readLine();
    Boolean userInput = Event.isWedding(inputStringWedding);

    System.out.println("How many people are attending the event?");
    String inputStringPeople = myConsole.readLine();
    int numberOfPeople = Integer.parseInt(inputStringPeople);
    int basePriceOfPeople = Event.getBaseCostForPeople(numberOfPeople);
    System.out.println(basePriceOfPeople);

    System.out.println("How many hours do you anticipate the event to last?");
    String inputStringHours = myConsole.readLine();
    int intCostPerHour = Integer.parseInt(inputStringHours);
    int totalPriceForHours = Event.getNumberOfHours(intCostPerHour);
    System.out.println(totalPriceForHours);

    System.out.println("currently we have 3 options for catering food, we can cater through Panda Express, Fogo De Chao *reccomended, or Mcdonalds. (please enter panda, fogo, or mcdonalds)");
    String inputStringFood = myConsole.readLine();
    int totalCostFoodPackage = Event.whichFoodPackage(inputStringFood, numberOfPeople);
    System.out.println(totalCostFoodPackage);

    System.out.println("would you like an open bar? (yes/no)");
    String inputStringDrinks = myConsole.readLine();
    int totalDrinkCost = Event.whichDrinkPackage(inputStringDrinks, numberOfPeople);
    System.out.println(totalDrinkCost);

    System.out.println("We have four options for where you can have this event to take place? (please type hawaii, california, spain, or nearby)");
    String inputStringLocation = myConsole.readLine();
    int totalLocationCost = Event.whichLocation(inputStringLocation);
    System.out.println(totalLocationCost);
  }
}
