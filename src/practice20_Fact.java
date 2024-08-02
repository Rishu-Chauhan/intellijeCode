import java.util.Scanner;
public class practice20_Fact {
    public static void main(String[] args) {
        System.out.println("Enter the number for the factorial");
        Scanner sc=new Scanner(System.in);
        int n,i,fact=1;
        n=sc.nextInt();
        for(i=1;i<n;i++){
            fact=fact*i;
        }
        System.out.println( "factorial of number is :"+fact);
    }
}
