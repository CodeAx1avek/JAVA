import java.util.*;
public class funcs{
    public static void Function(String name){
        System.out.println("Hey bro "+ name);
    }
    public static void main(String[] args) {
        System.out.println("Enter Your Name:");
        Scanner sc = new Scanner(System.in);
        String name = sc.next();
        Function(name);
    }
}
