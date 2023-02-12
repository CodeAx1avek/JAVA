import java.util.Scanner;
public class marks {
    public static void main(String[] args) {
        byte m1,m2,m3;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the marks 1:");
        m1 = sc.nextByte();
        System.out.println("Enter the marks 2");
        m2 = sc.nextByte();
        System.out.println("Enter the marks 3");
        m3 = sc.nextByte();
        float avg = (m1+m2+m3)/3.0f;
        if(avg>=40 && m1>=33 && m2>=33 && m3>=33){
            System.out.println("You are Passed :");
        }
        else{
            System.out.println("You Are fail");
        }
    }
}
