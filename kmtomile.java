import java.util.Scanner;
public class kmtomile {
    public static void main(String[] args){
        System.out.println("Welcome to Convert of KM to Miles");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Your Name: ");
        String name = sc.nextLine();
        System.out.print("Enter Km: ");
        int km = sc.nextInt();
        double mile = km * 0.621371;
        System.out.println("Hey "+name+" Here We Have Calculated miles: "+mile);



    }
}
