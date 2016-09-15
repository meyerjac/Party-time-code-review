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

    System.out.println("We have three options for where you can have this event to take place? (please type hawaii, spain, or nearby)");
    String stringLocation = myConsole.readLine();

    System.out.println("you did it! you planned your Event! Below is your total ESTIMATED cost for this event!");

    PartyTime Event = new PartyTime(stringType, intPeople, intHours, stringFood, stringDrink, stringLocation);



    System.out.println("########################################");
    System.out.println("Event: you are hosting a " + stringType + " type of Event!");

    System.out.println("you will have" + intPeople + " people at this event, That's Awesome!");

    System.out.println("Time: your event will be " + intHours + " hours long! Wow!");

    System.out.println("Food: each food company has different prices, you chose " + stringFood + " and it will cost you an extra " +  Event.foodTotal() + "!!!");

    System.out.println("Drink: open bar is $20/head, otherwise it is no extra");

    System.out.println("Location: becuase you chose that location it is an extra " + "$" + Event.locationTotal();

    System.out.println("Location: becuase you chose that location it is an extra " + "$" + Event.TotalTotal();











  }
}


/*summary of your event!*/
