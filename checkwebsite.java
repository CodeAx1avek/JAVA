import java.util.Scanner;
public class checkwebsite {
    public static void main(String[] args){
        System.out.println("Here We Are To Check the whether given website is .com,.in,.org");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Website name: ");
        String web = sc.nextLine();
        if(web.endsWith(".com")){
            System.out.println("This is Commercial website");
        }
        else if(web.endsWith(".org")){
            System.out.println("This is Qrganisational Website");
        }
        else if(web.endsWith(".in")){
            System.out.println("This is Indian Website");
        }
        else{
            System.out.println("Sorry we can't Detect the given website");
        }
    }
}
