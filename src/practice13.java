import  java.util.Scanner;
public class practice13 {
    public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
        System.out.println("Enter your income in lakhs per annum:");
        float tax=0;
        float income=sc.nextFloat();
        if(income<=2.5){
            tax=tax+0;
        }
        else if(income>2.5f && income <=5f){
            tax=tax+0.5f*(income-2.5f);
        }
        else if(income>5f && income<=10.0f){
            tax=tax+0.05f*(5.0f-2.5f);
            tax=tax+0.2f*(income-5f);
        }
        else if(income>10.0f){
            tax=tax+0.05f*(5.f-2.5f);
            tax=tax+0.2f*(10.0f-5f);
            tax=tax+0.3f*(income-10.0f);
        }
        System.out.println("The total tax paid by employee is:" +tax);
    }
}
