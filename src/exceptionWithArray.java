import java.util.Scanner;
public class exceptionWithArray {
    public static void main(String []args){
        int arr[]=new int[3];
        arr[0]=70;
        arr[1]=7;
        arr[2]=72;
        Scanner sc =new Scanner(System.in);
        System.out.println("enter the array index");
        int ind=sc.nextInt();
        System.out.println("enter the no.you want to divide value with:");
        int num=sc.nextInt();
        try{
            System.out.println("the value of array index entered is:"+ arr[ind]);
            System.out.println("the value of array value/num is:"+arr[ind]/num);
        }
        catch(ArithmeticException e){
            System.out.println("Arithmetic Exception occured!");
            System.out.println(e);
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("ArrayIndexOutOfBoundsException occur:");
            System.out.println(e);
        }
        catch(Exception e){
            System.out.println("some other exception occured");
            System.out.println(e);
        }
    }
}
