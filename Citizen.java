import java.util.*;
public class Citizen
{
    public Citizen (Name n, String home, String office, String phone, String mail, boolean Case)
    {
        this.name = n;
        this.HomeAddress = home;
        this.OfficeAddress = office;
        this.PhoneNum = phone;
        this.email = mail;
        VisitRecord = new ArrayList<Entry> ();
        this.Case = Case;
    }
    // getters
    public Name getName ()
    {
        return this.name;
    }

    public String getHomeAddress ()
    {
        return this.HomeAddress;
    }

    public String getOfficeAddress ()
    {
        return this.OfficeAddress;
    }

    public String getPhoneNum ()
    {
        return this.PhoneNum;
    }

    public String getEmail ()
    {
        return this.email;
    }

    // number of times the citizen visited 
    public int getNumVisits ()
    {
        return VisitRecord.size();
    }

    // get a specific entry
    public Entry getVisit (int entryIndex)
    {
        return VisitRecord.get(entryIndex);
    }
    // setters
    public void setName (Name n)
    {
        this.name = n;
    }

    public void setEmail (String mail)
    {
        this.email = mail;
    }

    public void setOfficeAddress (String office)
    {
        this.OfficeAddress = office;
    }

    public void setPhoneNum (String phone)
    {
        this.PhoneNum = phone;
    }

    public void setHomeAddress (String home)
    {
        this.HomeAddress = home;
    }
    
    // adds an entry to the citizen's visit records (ArrayList)
    public void addVisit (Entry visit)
    {
        VisitRecord.add(visit);
    }

    // determines if the citizen is diagnosed as + or -
    public String CaseDiagnosis ()
    {
        if (Case == false)
            return "negative";
        else
            return "positive";
    }

    public String toString ()
    {
        return name + ", "+ HomeAddress + ", " + OfficeAddress + ", " + PhoneNum + ", " + email + ", " + CaseDiagnosis(); 
    }

    private Name name;
    private String HomeAddress; 
    private String OfficeAddress; 
    private String PhoneNum;
    private String email;
    private ArrayList<Entry> VisitRecord; // record of visits
    private boolean Case; // positive or negative
}