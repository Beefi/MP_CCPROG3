import java.util.*;

public class Login
{
    public void Login (Program sys)
    {
        String username, password;
        Scanner input = new Scanner (System.in);
        do
        {
            System.out.println("Username:");
            username = input.nextLine();
            System.out.println("Password:");
            password = input.nextLine();
        } while (!this.doesAccountExist(sys, username, password));

    }

    public boolean doesAccountExist (Program sys, String username, String password)
    {
        int i;
        boolean bUser = false;
        for (i = 0; i < sys.getNumUsers(); i++) {
            if (sys.getUser(i).getAccountInfo().getUsername().equals(username))
                bUser = true;
            else {
                System.out.println("Username does not exist");
                return false;
            }
        }
        for (i = 0; i < sys.getNumUsers(); i++) {
            if (bUser && sys.getUser(i).getAccountInfo().getPassword().equals(password))
                return true;
            else {
                System.out.println("Password is false");
                return false;
            }
        }

        return false;
    }
}
