import java.util.Random;
import java.util.Scanner;
public class practice17 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter 0 for rock,1 for paper,2 for scissor:");
        int userInput=sc.nextInt();
        Random rnd=new Random();
        int computerInput=rnd.nextInt(3);
        if(computerInput==userInput){
            System.out.println("Tie");
        }
        else if(computerInput==0 && userInput==1 ||  computerInput==1 && userInput==2|| computerInput==2 && userInput==0){
            System.out.println("User win!");
        }

        else{
            System.out.println("Computer win!");
        }
        System.out.println("user choice is:"+userInput);
        System.out.println("Computer choice is :"+computerInput);
        if(computerInput==0){
            System.out.println("Computer choice is rock:");
        }
        else if(computerInput==1){
            System.out.println("Computer choice is paper:");
        }
        else {
            System.out.println("Computer choice is scissor:");
        }
    }

}
