import java.util.Scanner;
public class ErrorAndException {
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your number");
        int a=sc.nextInt();
        int b=sc.nextInt();
        try{
            int div=a/b;
            System.out.println(div);
        }
        catch(Exception e){
            System.out.println("Invalid");
            //System.out.println(e);
        }
        System.out.println("end of programm");
    }
}
