import java.util.*;
public class Program
{
    String govOff = "GovOfficial";
    
    public Program ()
    {
        database = new ArrayList<User> ();
    }

    public void addUser (User newUser)
    {
        database.add(newUser);
        userCount++;
    }

    public User getUser (int index)
    {
        return database.get (index);
    }

    public Account getUserAcc (int index) // returns the account info of the user
    {
        return database.get (index).getAccountInfo();
    }

     public Citizen getUserPerInfo (int index) // returns the personal info of the user
    {
        return database.get (index).getPersonalInfo();
    }

    public int getNumUsers ()
    {
        return userCount;
    }

    public int getNumGovOfficials () // no of GovOfficials in the database
    {
        int i; // counter 
        for (i=0; i < userCount; i++)
        {
            if (database. get (i).getAccountInfo().getRole().equalsIgnoreCase(govOff))
                i++;
        }
        return i;
    }

    public ArrayList<String> getGovOfficials () // list of usernames of GovOfficials in the database
    {
        int i = 0;
        ArrayList<String> goOff = new ArrayList<String> ();
        for (i=0; i < userCount; i++)
        {
            if (database. get (i).getAccountInfo().getRole().equalsIgnoreCase(govOff))
                goOff.add(database. get (i).getAccountInfo().getUsername());
        }
        return goOff;
    }

    private ArrayList<User> database;
    private static int userCount = 0;
}