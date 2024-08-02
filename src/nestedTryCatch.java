import java.util.Scanner;
public class nestedTryCatch {
    public static void main(String[] args) {
        int arr[]=new int [3];
        arr[0]=10;
        arr[1]=20;
        arr[2]=30;
        Scanner sc =new Scanner(System.in);
        ;
        System.out.println("enter the array index");
        int ind=sc.nextInt();
        try{
            System.out.println("welcome to my tutorial");
            try{
                System.out.println(arr[ind]);
            }
            catch(ArrayIndexOutOfBoundsException e){
                System.out.println("Sory this index does not exist");
                System.out.println("exception in level 2");
            }
        }
        catch(Exception e){
            System.out.println("exception in level 1");
        }
    }
}
