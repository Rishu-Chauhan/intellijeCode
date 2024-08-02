import java.util.Scanner;
public class exception2{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter value for a");
        int a=sc.nextInt();
        System.out.println("Enter value for b");
        int b=sc.nextInt();

        try{
            int sum=a/b;
            System.out.println(sum);
        }
        catch(Exception e){
            System.out.println("invalid syntax");
            System.out.println(e);
        }

    }
}
