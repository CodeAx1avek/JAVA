import java.util.Scanner;

public class first {
    public static void main(String[] args) {
        System.out.println("Hello User Marks Percentage Calculator By CodeAx1");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Your First Subject Marks: ");
        int s1 = sc.nextInt();
        System.out.print("Enter Your Second Subject Marks: ");
        int s2 = sc.nextInt();
        System.out.print("Enter Your thrid Subject Marks: ");
        int s3 = sc.nextInt();
        System.out.print("Enter Your fourth Subject Marks: ");
        int s4 = sc.nextInt();
        System.out.print("Enter Your fifth Subject Marks: ");
        int s5 = sc.nextInt();
        System.out.print("Enter Your Sixth Subject marks");
        int s6 = sc.nextInt();
        System.out.print("Enter Your Seventh Subject marks");
        int s7 = sc.nextInt();
        System.out.print("From How many Marks 100 or 80: ");
        int m = sc.nextInt();
        System.out.print("From Total  500 or 600 or 650 select or other : ");
        int total = sc.nextInt();
        int sum = s1+s2+s3+s4+s5+s6+s7;
        int all = sum * m / total;
        System.out.println("Your Total Marks is :"+sum);
        System.out.println("The Percentage is "+all+"%");
        if (all < 35 ) {
            System.out.println("You Are Failed");
        }
        else {
            System.out.println("Congrulation! You Are Passed ");
        }
    }
}