import java.util.Scanner;
public class practice04 {
    public static void main(String[] args) {
        System.out.println("Enter distance in KM:");
        Scanner sc=new Scanner(System.in);
        float km=sc.nextFloat();
        float miles=(float)(0.621371*km);
        System.out.println("The distance in miles will be:" +miles);
    }
}
