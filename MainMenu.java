import java.util.*;
import java.lang.*;
public class MainMenu
{
    public static void MainMenu (Program sys)
    {
        Scanner input = new Scanner (System.in);
        int choice;
        do 
        {
            System.out.println("Input the number of choice:");
            System.out.println("1 - Register");
            System.out.println("2 - Log In");
            System.out.println("3 - Exit");
            choice = input.nextInt();
            
            switch (choice) {
                case 1: {
                    Register reg = new Register();
                    reg.Register(sys);
                    break;
                }
                case 2: {
                    Login login = new Login();
                    login.Login(sys);
                    break;
                }
                case 3:
                    System.exit(0);
            }
        } while (true);
    }
}