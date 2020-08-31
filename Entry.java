
public class Entry
{
    public Entry (String c, String d, String t)
    {
        code = c;
        dateVisit = d;
        time = t;
    }
    
    public String getCode ()
    {
        return code;
    }

    public String getDate ()
    {
        return dateVisit;
    }

    public String getTime ()
    {
        return time;
    }

    public String toString ()
    {
        return code + ", "+ dateVisit + ", " + time;
    }
    private static String code;
    private String dateVisit; // will change type in phase 2
    private String time; // will change type in phase 2
}