import java.util.Scanner;
public class practice02 {
    public static void main(String[] args) {
        System.out.println("Enter your five subject:");
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        int d=sc.nextInt();
        int e=sc.nextInt();
        int sum=a+b+c+d+e;
        double percentage=(sum*100)/500;
        System.out.println("THe percentage of five subject is :" +percentage);
    }
}
