import java.util.Scanner;
public class practice15 {
    public static void main(String[] args) {
        System.out.println("Enter the year to check for leap wear or not:");
        Scanner sc=new Scanner(System.in);
        int year=sc.nextInt();
        if(year%4==0 || year%400==0 && year%100!=0){
            System.out.println("yes this  is a leap year");
        }
        else{
            System.out.println("the year is not a leap year");
        }

    }
}
