import java.util.Scanner;
public class case1 {
    public static void main(String[] args){
        System.out.println("Switch Case Representation");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter The Day Number 1 to 7: ");
        int day = sc.nextInt();
        switch(day){
            case 1:
                System.out.println("Today is Sunday");

            case 2:
                System.out.println("Today is monday");
            case 3:
                System.out.println("Today is Tuesday");
            case 4:
                System.out.println("Today is Wednesday");
            case 5:
                System.out.println("Today is Thursday");
            case 6:
                System.out.println("Today is friday");
            case 7:
                System.out.println("Today is Saturday");
        }
    }
}
