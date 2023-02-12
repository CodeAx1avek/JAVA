import java.lang.*;
import java.util.Scanner;

public class challenge{
    public static void main(String args[]) {
        new Test().doOverLoad();
    }
}
class Test
{
    public void doOverLoad()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number: ");
        int x = sc.nextInt();
        System.out.println("Enter The Double: ");
        double y = sc.nextDouble();
        System.out.println("Your Numbers Are:"+x+"\nYour Boolean Number are"+y);
        System.out.println(square(x)+"\n"+square(y));
    }
    public int square(int y)
    {
        return y*y;
    }

    public double square(double y)
    {
        return y*y;
    }
}
