import java.util.Scanner;
public class practice12
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter your marks in physics:");
        int m1=sc.nextInt();
        System.out.println("enter your marks in chemistry:");
        int m2=sc.nextInt();
        System.out.println("enter your marks in mathematics");
        int m3=sc.nextInt();
        float avg=(m1+m2+m3)/3.0f;
        System.out.println("your overall percentage is:"+ avg);
        if(avg>=40 && m1>=33 && m2>=33 && m3>=33){
            System.out.println("Congratulation, you have been promoted!");
        }
        else{
            System.out.println("Sorry, you have not been promoted ,please try again !");
        }
    }
}
