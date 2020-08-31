import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Register
{
    public void Register (Program sys)
    {
        String username, password;
        Scanner input = new Scanner (System.in);
        do
        {
            System.out.println("Input your username:");
            username = input.nextLine();
        } while (!this.isUsernameValid(sys, username));
        do
        {
            System.out.println("Input your password (Max 6 characters and has at least one non-alphabetic character):");
            password = input.nextLine();
        } while (!this.isPasswordValid(password));

        sys.addUser(new User(new Account(username,password)));
    }

    public boolean isUsernameValid (Program sys, String username)
    {
        int i; // counter
        boolean isFound = false;
        if (sys.getNumUsers() == 0) // Checks if the database is empty.
            return true;
        else
        {
            for (i=0; i < sys.getNumUsers() && !isFound; i++)
            {
                if (sys.getUser(i).getAccountInfo().getUsername().equalsIgnoreCase(username))
                    isFound = true;
            }

            if (isFound)
                return false;
            else
                return true;
        }
    }

    public boolean isPasswordValid (String password) {
        Pattern pattern = Pattern.compile("[a-zA-Z0-9]*");
        Matcher matcher = pattern.matcher(password);
        char[] passwordArray = password.toCharArray();
        if (password.length() <= 6) //Checks if password is less than 10 Characters
        {
            for (char c : passwordArray) //Checks if password contains a digit
            {
                if (Character.isDigit(c))
                    return true;
            }
            // Checks if password contains a unique character
            return !matcher.matches();
        }
        else
            return false;
    }
}