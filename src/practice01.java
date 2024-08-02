import java.util.Scanner;
public class practice01
{
    public static void main(String aarhs[]){
        System.out.println("Enter your three numbers:");
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        int sum=a+b+c;
        System.out.println("The sum of these number is:"+sum);
    }
}
