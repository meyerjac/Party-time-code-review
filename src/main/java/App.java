import java.io.Console;

public class App {
  public static void main(String[] args) {
    Console myConsole = System.console();

    PartyTime Event = new PartyTime("", 0,0,"","","");

    System.out.println("I am guessing you are here to plan an event, are you here to plan a wedding? (answer: yes or no)");
    String inputStringWedding = myConsole.readLine();
    boolean boolUserInput = Event.isWedding(inputStringWedding);

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


    System.out.println("you did it! you planned your Event! Below are the details of your event, the costs broken down for each selection and your total ESTIMATED cost!");

    System.out.println("Your event:");
    System.out.println("Event: you are hosting a wedding? " + boolUserInput);
    System.out.println("People: we have an hourly base price of $10/person, so your total fee is " + "$" + basePriceOfPeople);
    System.out.println("Time: we have an hourly base price of $2/person/hr, so your hourly fee is " + "$" + totalPriceForHours + "per person");
    System.out.println("Food: each food company has different prices, the catering company you chose will cost you an extra " + "$" + totalCostFoodPackage);
    System.out.println("Drink: open bar is $20/head, otherwise it is no extra, your total cost for your party with you amount of guests is " + "$" + totalDrinkCost);
    System.out.println("Location: becuase you chose that location it is an extra " + "$" + totalLocationCost);
    // 
    // System.out.println("Total: "
  }
}
