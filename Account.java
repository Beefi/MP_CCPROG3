public class Account
{
    public Account (String uname, String pass, String role)
    {
        this.USERNAME = uname;
        this.password = pass;
        this.ROLE = role;
    }
    
    public Account (String uname, String pass)
    {
        this.USERNAME = uname;
        this.password = pass;
        this.ROLE = "Citizen";
    }

    // getters
    public String getUsername ()
    {
        return this.USERNAME;
    }

    public String getPassword ()
    {
        return this.password;
    }

    public String getRole ()
    {
        return this.ROLE;
    }

    // setter (password only)
    public void changePassword (String newPass)
    {
        this.password = newPass;
    }

    // toString ()
    public String toString ()
    {
        return USERNAME + ", " + password + ", " + ROLE;
    }
    private final String USERNAME;
    private String password;
    private final String ROLE;
}