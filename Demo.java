import java.util.Scanner;
public class Demo
{
    
    public static void main(String [] args)
    {
        Scanner kb = new Scanner(System.in);
        System.out.println("Enter a number");
        double d = kb.nextDouble();
        Prog p;
        if(d % 2 == 0)
        {
            p = new ProgOne();
        }
        else
        {
            p = new progtwo();
        }
        p.run();
    }
}
