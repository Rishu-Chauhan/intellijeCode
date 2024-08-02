import java.util.Scanner;
public class practice11 {
    public static void main(String[] args) {
        System.out.println("Enter the age:");
        Scanner sc=new Scanner(System.in);
        int age=sc.nextInt();
        if(age>56)
        {
            System.out.println("you are experienced! ");
        }


        else if(age>46){
            System.out.println("you are semi-experienced!");
        }
        else if(age>37){
            System.out.println("you semi-semi-experienced!");
        }
        else{
            System.out.println("you are not experienced");
        }
    }
}
