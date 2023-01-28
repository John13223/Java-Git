import java.util.InputMismatchException;
import java.util.Scanner;
public class Demo
{
    static Scanner kb;
    public static void main(String [] args)
    {
         kb = new Scanner(System.in);
        System.out.println("Enter a number");
       
        Prog p;
        if(getInput() % 2 == 0)
        {
            p = new ProgOne();
        }
        else
        {
            p = new ProgTwo();
        }
        p.run();
    }
    
    private static int getInput()
    {
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
