package com.company;
import java.util.Scanner;
public class practice18 {
    public static void main(String[] args) {
        System.out.println("enter the number:");
Scanner sc=new Scanner(System.in);
int i,n;
//n=sc.nextInt();
//do{
//    System.out.println((i));
//    i++;
//}
//while(i<=n);
//        for(i=1;i<n;i++){
//            System.out.println(2*i+1);
//        }

//        for(i=n;i>0;i--){
//            System.out.println(i);
//        }

        //break statement
//for(i=0;i<10;i++){
//    System.out.println(i);
//    System.out.println("java is Great");
//    if(i==2){
//        System.out.println("Ending the loop");
//        break;
//    }
//}

//continue Statement
        for(i=0;i<10;i++){
            if(i==2){
                System.out.println("Ending the loop");
                continue;
            }
            System.out.println(i);
            System.out.println("Java is great");
        }
    }
}
