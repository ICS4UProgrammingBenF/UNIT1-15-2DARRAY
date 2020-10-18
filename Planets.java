//import necessary libraries
import java.util.Scanner;

/**
* This program uses enumeration to output different data.
*
* @author  Ben Falsetto
* @version 1.0
* @since   2020-10-16
*/
public class Planets {
  
  /**
   * This is the main procedure.
  */
  public static void main(String[] args) {
    //declare and initialize variables
    //Planet planet;
    //Day day;
    //Season season;
    
    //get the planet from the user
    System.out.print("Enter the planet you want to travel to: ");
    Scanner input = new Scanner(System.in);
    String userPlanet = input.nextLine();
    
    //convert the user input to upper case
    userPlanet = userPlanet.toUpperCase();
    
    //calling the planetchosen procedure
    Planet planet = Planet.valueOf(userPlanet);
    planetchosen(planet);
    
    //calling the planetinfo procedure
    planetinfo(planet);
    
    //get the day of the week from the user
    System.out.print("Enter the day of the week: ");
    String dayOfWeek = input.nextLine();
    
    //convert the user input to upper case
    dayOfWeek = dayOfWeek.toUpperCase();
    
    //calling the daychosen procedure
    Day day = Day.valueOf(dayOfWeek);
    daychosen(day);
    
    //calling the dayinfo procedure
    dayinfo(day);
    
    //get the season from the user
    System.out.print("Enter the season: ");
    String userSeason = input.nextLine();
    input.close();
    
    //convert the user input to upper case
    userSeason = userSeason.toUpperCase();
    
    //calling the seasonchosen procedure
    Season season = Season.valueOf(userSeason);
    seasonchosen(season);
    
    //calling the cheesypun procedure
    cheesypun(planet);
  }
  
  /**
   * Creating the planet enum.
  */
  public enum Planet  {
    MERCURY,
    VENUS,
    EARTH,
    MARS,
    JUPITER,
    SATURN,
    URANUS,
    NEPTUNE,
    PLUTO
  }
  
  /**
   * Creating the day enum.
  */
  public enum Day {
    SUNDAY,
    MONDAY,
    TUESDAY,
    WEDNESDAY,
    THURSDAY,
    FRIDAY,
    SATURDAY
  }
  
  /**
   * Creating the season enum.
  */
  public enum Season  {
    SUMMER,
    FALL,
    WINTER,
    SPRING
  }
  
  /**
   * This procedure tells the user which planet they chose.
  */
  public static void planetchosen(Planet planet)  {
    switch (planet) {
      case MERCURY:
        System.out.println("You chose: Mercury"); //tell the user which planet they chose
        break;
      
      case VENUS:
        System.out.println("You chose: Venus"); //tell the user which planet they chose
        break;
      
      case EARTH:
        System.out.println("You chose: Earth"); //tell the user which planet they chose
        break;
      
      case MARS:
        System.out.println("You chose: Mars"); //tell the user which planet they chose
        break;
      
      case JUPITER:
        System.out.println("You chose: Jupiter"); //tell the user which planet they chose
        break;
      
      case SATURN:
        System.out.println("You chose: Saturn"); //tell the user which planet they chose
        break;
      
      case URANUS:
        System.out.println("You chose: Uranus"); //tell the user which planet they chose
        break;
      
      case NEPTUNE:
        System.out.println("You chose: Neptune"); //tell the user which planet they chose
        break;
      
      default:
        System.out.println("You chose: Pluto"); //tell the user which planet they chose
        break;
    }
  }
  
  /**
   * This procedure tells the user some information about the planet.
  */
  public static void planetinfo(Planet planet)  {
    switch (planet) {
      case MERCURY:
        System.out.println("It would take 40 days to travel to Mercury(if you're lucky)"); 
        //print to the console why they probably shouldn't go
        break;
      
      case VENUS:
        System.out.println("110 days at best (and that's only for a flyby)"); 
        //print to the console why they probably shouldn't go
        break;
      
      case EARTH:
        System.out.println("Good news! You made it!"); 
        //print to the console why this is a good idea
        break;
      
      case MARS:
        System.out.print("Anywhere between 6-8 months to get to mars.");
        System.out.println(" I hope you get along with everyone..."); 
        //print to the console why they probably shouldn't go
        break;
      
      case JUPITER:
        System.out.print("I'll just say this: They launched one ");
        System.out.println("to get to Jupiter in 2011, and it only got there in 2016"); 
        //print to the console why they probably shouldn't go
        break;
      
      case SATURN:
        System.out.print("3 years and 2 months just to go to a planet");
        System.out.println(" with no surface? You probably won't collect any rocks there..."); 
        //print to the console why they probably shouldn't go
        break;
      
      case URANUS:
        System.out.print("If you're willing to throw away ");
        System.out.println("a decade to make a cheesy joke, be my guest"); 
        //print to the console why they probably shouldn't go
        break;
      
      case NEPTUNE:
        System.out.print("12 years to Neptune, you better ");
        System.out.println("hope there's in-flight entertainment"); 
        //print to the console why they probably shouldn't go
        break;
      
      default:
        System.out.print("9 years to travel to a fraud? ");
        System.out.println("I'll waste my time somewhere else thank you"); 
        //print to the console why they probably shouldn't go
        break;
    }
  }
  
  /**
   * This procedure tells the user which day they selected.
  */
  public static void daychosen(Day day) {
    switch (day) {
      case SUNDAY:
        System.out.println("You chose: Sunday"); //tell the user which day they chose
        break;
      
      case MONDAY:
        System.out.println("You chose: Monday"); //tell the user which day they chose
        break;
      
      case TUESDAY:
        System.out.println("You chose: Tuesday"); //tell the user which day they chose
        break;
      
      case WEDNESDAY:
        System.out.println("You chose: Wednesday"); //tell the user which day they chose
        break;
      
      case THURSDAY:
        System.out.println("You chose: Thursday"); //tell the user which day they chose
        break;
      
      case FRIDAY:
        System.out.println("You chose: Friday"); //tell the user which day they chose
        break;
      
      default:
        System.out.println("You chose: Saturday"); //tell the user which day they chose
        break;
    }
  }
  
  /**
   * This procedure tells the user some information about the planet.
  */
  public static void dayinfo(Day day) {
    switch (day) {
      case SUNDAY:
        System.out.println("You should be in church, not in space"); //comment on the day chosen
        break;
      
      case MONDAY:
        System.out.println("Mondays. Gotta love 'em"); //comment on the day chosen
        break;
      
      case TUESDAY:
        System.out.println("I guess Tuesdays are fine"); //comment on the day chosen
        break;
      
      case WEDNESDAY:
        System.out.println("Halfway through the week, and you want to go to space??");
        //comment on the day chosen
        break;
      
      case THURSDAY:
        System.out.print("Friday is literally tomorrow, you're ");
        System.out.println("throwing away all of your suffering"); 
        //comment on the day chosen
        break;
      
      case FRIDAY:
        System.out.println("It's Friday!!!!! Space? ");
        System.out.println("Never heard of it"); 
        //comment on the day chosen
        break;
      
      default:
        System.out.print("Its launch day! What's that? ");
        System.out.println("You slept in?"); 
        //comment on the day chosen
        break;
    }
  }
  
  /**
   * This procedure tells the user which season they selected.
  */
  public static void seasonchosen(Season season) {
    switch (season) {
      case SUMMER:
        System.out.println("You chose: Summer"); //user chose summer
        break;
      
      case FALL:
        System.out.println("You chose: Fall"); //user chose fall
        break;
      
      case WINTER:
        System.out.println("You chose: Winter"); //user chose winter
        break;
      
      default:
        System.out.println("You chose: Spring"); //user chose spring
        break;
    }
  }
  
  /**
   * This procedure tells the user a pun.
  */
  public static void cheesypun(Planet planet)  {
    switch (planet) {
      case MERCURY:
        System.out.print("What did Freddy Mercury say about ");
        System.out.println("the new airline fee for checked bags?"); //leadup
        System.out.println("Carry on, Carry on. Doesn’t really matter."); //punchline
        break;
      
      case VENUS:
        System.out.print("Freddie Mercury, Venus Williams, ");
        System.out.println("and Bruno Mars into a bar..."); //leadup
        System.out.println("...But they didn't planet that way"); //punchline
        break;
      
      case EARTH:
        System.out.println("I love the way the Earth Rotates"); //leadup
        System.out.println("It really makes my day"); //punchline
        break;
      
      case MARS:
        System.out.println("Why are there no cats on Mars?"); //leadup
        System.out.println("Curiosity killed them all"); //punchline
        break;
      
      case JUPITER:
        System.out.println("How does a Man cut his hair on the moon?"); //leadup
        System.out.println("Eclipse it."); //punchline
        break;
      
      case SATURN:
        System.out.println("Why couldn’t the astronaut focus?"); //leadup
        System.out.println("He kept spacing out."); //punchline
        break;
      
      case URANUS:
        System.out.println("How do you organize a space party?"); //leadup
        System.out.println("You planet"); //punchline
        break;
      
      case NEPTUNE:
        System.out.println("What kind of music do planets like?"); //leadup
        System.out.println("Neptunes"); //punchline
        break;
      
      default:
        System.out.print("Pluto always wanted to have a ");
        System.out.println("party for the outer gas giants…"); //leadup
        System.out.println("... but he just couldn’t find time to planet."); //punchline
        break;
    }
  }
}