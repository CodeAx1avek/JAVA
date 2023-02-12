import java.util.Scanner;
public class proj1 {
    public static void main(String[] args){
        System.out.print("Enter the number you want to get multiplication of: ");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        for(int i=1;i<=10;i++){
            System.out.println(a+" "+i+"= "+i*a);
        }
    }
}
