public class Name 
{
    public Name (String f, String m, String l)
    {
        first = f;
        middle = m;
        last = l;
    }

    public String getFirst ()
    {
        return first;
    }

    public String getMiddle ()
    {
        return middle;
    }

    public String getLast ()
    {
        return last;
    }

    public void setFirst (String f)
    {
        first = f;
    }

    public void setMiddle (String m)
    {
        middle = m;
    }

    public void setLast (String l)
    {
        last = l;
    }

    public String toString ()
    {
        return first + " " + middle + ". " + last;
    }

    private String first;
    private String middle;
    private String last;
}