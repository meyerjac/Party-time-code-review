import java.io.Console;

public class App {
  public static void main(String[] args) {
    Console myConsole = System.console();

    System.out.println("Welcome to the event planner, are you here to plan a wedding, birthday party or other? (answer: wedding, birthday, other)");
    String inputStringType = myConsole.readLine();
    int stringUserInput = Event.getType(inputStringType);

    System.out.println("How many people are attending the event?");
    String inputStringPeople = myConsole.readLine();
    int numberOfPeople = Integer.parseInt(inputStringPeople);
    int baseCostForPeople = Event.getBaseCostForPeople(numberOfPeople);
    System.out.println(baseCostForPeople);

    System.out.println("How many hours do you anticipate the event to last?");
    String inputStringHours = myConsole.readLine();
    int inputHours = Integer.parseInt(inputStringHours);
    int inputIntHours = Event.getNumberOfHours(inputHours);
    System.out.println(inputIntHours);

    System.out.println("currently we have 3 options for catering food, we can cater through Panda Express, Fogo De Chao *recommended, or Mcdonalds. (please enter panda, fogo, or mcdonalds)");
    String inputStringFood = myConsole.readLine();
    int foodCostPerPerson = Event.getFoodCostPerPerson(inputStringFood);
    System.out.println(foodCostPerPerson);

    System.out.println("would you like an open bar? (yes/no)");
    String inputStringDrinks = myConsole.readLine();
    int totalDrinkCost = Event.getDrinkCostPerPerson(inputStringDrinks);
    System.out.println(totalDrinkCost);

    System.out.println("We have four options for where you can have this event to take place? (please type hawaii, california, spain, or nearby)");
    String inputStringLocation = myConsole.readLine();
    int totalLocationCost = Event.getLocation(inputStringLocation);
    System.out.println(totalLocationCost);

    System.out.println("you did it! you planned your Event! Below are the details of your event, the costs broken down for each selection and your total ESTIMATED cost!");

    /*summary of your event!*/

    System.out.println("YOUR EVENT:");
    System.out.println("Event: you are hosting a " + inputStringType + " type of Event");

    System.out.println("you will have" + numberOfPeople + " people at this event, nice!");

    System.out.println("Time: your event will be " + inputHours + " hours long");

    System.out.println("Food: each food company has different prices, you chose " + inputStringFood + "will cost you extra $$$$");

    System.out.println("Drink: open bar is $20/head, otherwise it is no extra");

    System.out.println("Location: becuase you chose that location it is an extra " + "$" + totalLocationCost);


  }
}
