import java.util.*;
public class arrayoned {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Size");
        int a = sc.nextInt();
        System.out.println("Enter the Number ");
        int marks[] = new int[a];
        for (int i = 0; i < a; i++) {
            marks[i] = sc.nextInt();

        }
        System.out.println("Enter the Number wnaa find by index ");
        int x = sc.nextInt();
        for (int i = 0; i < a; i++) {
            System.out.println(marks[i]);
        }

        for (int i = 0; i < marks.length; i++) {
            if (marks[i] == x) {
                System.out.println("Your index is");
                System.out.println(i);
            }
        }
    }}
