public class User
{
    public User (Account a, Citizen c)
    {
        this.account = a;
        this.personalInfo = c;
        this.assignedTracer = null;
        this.status = false;
    }

    public User (Account a)
    {
        this.account = a;
        this.personalInfo = null;
        this.assignedTracer = null;
        this.status = false;
    }

    public String showStatus ()
    {
        if (status == false)
            return "Pending";
        else
            return "Tracing Done";
    }
    
    public Account getAccountInfo ()
    {
        return account;
    }

    public Citizen getPersonalInfo ()
    {
        return personalInfo;
    }

    public String getAssignedTracer ()
    {
        return assignedTracer;
    }

    private Account account;
    private Citizen personalInfo;
    private String assignedTracer; 
    private boolean status; // false = pending, true = already traced
}