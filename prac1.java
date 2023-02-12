import java.util.Scanner;
public class prac1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Multiplication of Number");
        int num = sc.nextInt();
        System.out.println("Enter The Number You Want to Multiplicate:");
        for (int i = 1; i <= 10; i++) {
            System.out.println(num + "x" + i + "=" + num * i);
        }
    }
}
