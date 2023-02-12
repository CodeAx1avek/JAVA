import java.util.Scanner;
public class gradeproblem {
    public static void main(String[] args){
        System.out.println("Here We will encrypt our grade");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Your Grade: ");
        char grade = sc.next().charAt(0);
        char g = (char) (grade + 8);
        System.out.println("Your Encrypted Grade is "+g);

        System.out.println("Hello bro Now its time to decrypt the code:");
        char decode = (char) (g - 8);
        System.out.println("Your Decoded Grade is :"+decode);
    }
}
