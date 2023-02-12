//Exersice 1 :  Enter 3 numbers from the user & make a function to print their average.
import java.util.*;
public class exer1 {
    public static void average(int a, int b, int c) {
        int sum = (a + b + c) / 3;
        System.out.println(sum);

    }
public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        average(a,b,c);

    }
}




