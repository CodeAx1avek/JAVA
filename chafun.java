import java.util.*;
public class chafun {
    public static void function(int num1, int num2) {
        int num3 = num1 + num2;
        System.out.println("Your Sum is " + num3);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter your first number:");
        int num1 = sc.nextInt();
        System.out.print("Enter Your second number");
        int num2 = sc.nextInt();
        function(num1,num2);
    }
}
