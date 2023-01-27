import java.util.InputMismatchException;
import java.util.Scanner;

public class ProgTwo extends Prog
{
    static Scanner kb;
    public void run()
    {
        
        System.out.println("enter a number");
        double d = getInput();
        System.out.println("enter a number");
        double b = getInput();
        System.out.println(" You chose to subtract them. " + (d-b));
    }
    private static int getInput()
    {
        kb = new Scanner(System.in);
        boolean b = true;
        int i = 0;
        while (b != false)
        {
            try
            {
                i = kb.nextInt();
                b = false;
            }
            catch (InputMismatchException e)
            {
                System.out.println("Please enter a valid Double.");
                kb.nextLine();
            }
        }
        return i;
    }
}
