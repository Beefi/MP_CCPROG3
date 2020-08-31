import java.util.*;
import java.lang.*;
public class Main {
  public static void main(String[] args) 
{
    Program sys1 = new Program ();
    System.out.println("Main Menu:");
    System.out.println("----------------------------------------------");

    MainMenu menu = new MainMenu();
    menu.MainMenu(sys1);
/*
    Name Person1 = new Name ("Kate", "A", "Victorino");
    Name Person2 = new Name ("Miguel", "A", "Baliog");
    
    Entry entry1 = new Entry ("098ty", "August 27, 2020", "11:50PM");
    Entry entry2 = new Entry ("099lk", "August 28, 2020", "3:30PM");

    Citizen cit1 = new Citizen (Person1, "**** Residences", "DLSU Manila", "012345678", "kate@gmail.com", true);
    Citizen cit2 = new Citizen (Person2, "**** Residences", "DLSU Manila", "87654321", "migs@gmail.com", false);

    cit1.addVisit(entry1); // addVisit test
    cit1.addVisit(entry2);

    Account acc1 = new Account ("katev", "1234", "GovOfficial");
    Account acc2 = new Account ("migsb", "4567", "GovOfficial");

    User user1 = new User (acc1, cit1);
    User user2 = new User (acc2, cit2);

    Program sys1 = new Program ();
    sys1.addUser(user1);
    sys1.addUser(user2);
*/
  }
}