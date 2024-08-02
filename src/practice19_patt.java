import java.util.Scanner;
public class practice19_patt {
    public static void main(String[] args) {
       int n,i;
        System.out.println("enter the number:");
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        for(i=1;i<=10;i++){
            System.out.printf("%d*%d=%d\n",n,i,n*i);
        }
        System.out.println("multiplication in reverse order");
        for(i=10;i>0;i--){
            System.out.printf("%d*%d=%d\n",n,i,n*i);
        }
    }
}
