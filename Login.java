import java.util.*;

public class Login
{
    public void Login (Program sys)
    {
        String username, password;
        int userIndex;
        Scanner input = new Scanner (System.in);
        do
        {
            System.out.println("Username:");
            username = input.nextLine();
            System.out.println("Password:");
            password = input.nextLine();
        } while (this.doesAccountExist(sys, username, password) != -1);

        if (this.doesAccountExist(sys, username, password) != -1) {
            userIndex = this.doesAccountExist(sys, username, password);
            switch (sys.getUser(userIndex).getAccountInfo().getRole())
            {
                case "Citizen": 
                    break;
            }
        }

    }

    public int doesAccountExist (Program sys, String username, String password)
    {
        int i;
        boolean bUser = false;
        for (i = 0; i < sys.getNumUsers(); i++) {
            if (sys.getUser(i).getAccountInfo().getUsername().equals(username))
                bUser = true;
            else
                return -1;
        }
        for (i = 0; i < sys.getNumUsers(); i++) {
            if (bUser && sys.getUser(i).getAccountInfo().getPassword().equals(password))
                return i;
            else
                return -1;
        }
        return -1;
    }
}
