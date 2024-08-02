import java.util.Scanner;
public class practice16 {
    public static void main(String[] args) {
        System.out.println("enter website name:");
        Scanner sc=new Scanner(System.in);
        String website=sc.next();
        if(website.endsWith(".org")){
            System.out.println("This is an Organization website:");
        }

        else if(website.endsWith(".com")){
            System.out.println("This is a commercial website:");
        }
        else if(website.endsWith(".in")){
            System.out.println("This is an Indian website:");
        }
    }

}
