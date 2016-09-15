import java.io.Console;

public class App {
  public static void main(String[] args) {
    Console myConsole = System.console();

      // PartyTime Event = new PartyTime(StringType, intPeople, intHours, StringFood, StringDrink, StringLocation);



    System.out.println("Welcome to the event planner, are you here to plan a wedding, birthday party or other? (answer: wedding, birthday, other)");
    String stringType = myConsole.readLine();

    System.out.println("How many people are attending the event?");
    String inputStringPeople = myConsole.readLine();
    int intPeople = Integer.parseInt(inputStringPeople);

    System.out.println("How many hours do you anticipate the event to last?");
    String inputStringHours = myConsole.readLine();
    int intHours = Integer.parseInt(inputStringHours);

    System.out.println("currently we have 3 options for catering food, we can cater through Panda Express, Fogo De Chao *recommended, or Mcdonalds. (please enter panda, fogo, or mcdonalds)");
    String stringFood = myConsole.readLine();

    System.out.println("would you like an open bar? (yes/no)");
    String stringDrink = myConsole.readLine();

    System.out.println("We have four options for where you can have this event to take place? (please type hawaii, spain, or nearby)");
    String stringLocation = myConsole.readLine();

    System.out.println("you did it! you planned your Event! Below are the details of your event, the costs broken down for each selection and your total ESTIMATED cost!");


    PartyTime Event = new PartyTime(stringType, intPeople, intHours, stringFood, stringDrink, stringLocation);

    // System.out.println("Your party is going to cost you a total of " + Event.ThatTotal());
  }
}

//
// /*summary of your event!*/
//
// System.out.println("YOUR EVENT:");
// System.out.println("Event: you are hosting a " + inputStringType + " type of Event");
//
// System.out.println("you will have" + numberOfPeople + " people at this event, nice!");
//
// System.out.println("Time: your event will be " + inputHours + " hours long");
//
// System.out.println("Food: each food company has different prices, you chose " + inputStringFood + "will cost you extra $$$$");
//
// System.out.println("Drink: open bar is $20/head, otherwise it is no extra");
//
// System.out.println("Location: becuase you chose that location it is an extra " + "$" + totalLocationCost);
