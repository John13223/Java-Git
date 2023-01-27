import java.util.Scanner;

public class progtwo extends Prog
{
    public  void run()
    {
        Scanner kb = new Scanner(System.in);
        System.out.println("enter a number");
        double d = kb.nextDouble();
        System.out.println("enter a number");
        double b = kb.nextDouble();
        System.out.println(" You chose to subtract them. " + (d-b));
    }
}
