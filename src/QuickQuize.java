import java.util.Scanner;
class myException extends Exception{
    public String toString(){
        return "I am toString()";
    }
}
public class QuickQuize{
    public static void main(String []args){
        myException c=new myException();
        System.out.println(c.toString());
        Scanner sc=new Scanner(System.in);
        System.out.println("enter value for a:");
        int a=sc.nextInt();
        if(a<9){
            try{
                throw new Exception();
            }
            catch(Exception e){
                System.out.println(e.toString());
                System.out.println(e);
            }
        }
        System.out.println("finished ");
    }
}