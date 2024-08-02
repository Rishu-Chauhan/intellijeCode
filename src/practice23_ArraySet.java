import java.util.Scanner;
public class practice23_ArraySet {
    public static void main(String[] args) {
//        float arr[]={12.0f,44.0f,67.0f,89.0f,99.0f};
//        float sum=0;
//        for (float element : arr){
//            sum=sum+element;
//        }
//        System.out.println(sum);
//

        //Q-->2
//        Scanner sc=new Scanner(System.in);
//        System.out.println("enter the number:");
//        int num =sc.nextInt();
//        int marks[]={3,5,8,6,9};
//        boolean isInArray=false;
//        for (int element:marks){
//            if (num==element){
//                isInArray=true;
//                break;
//            }
//        }
//        if (isInArray){
//            System.out.println("number present in array");
//        }
//        else{
//            System.out.println("number not pressent in array");
//        }
        //Q-->3
//        int sum=0;
//        float avg=0;
//        int marks[]={78,64,90,98};
//        for (int element:marks){
//            sum=sum+element;
//            avg=sum/4.0f;
//        }
//        System.out.println(avg);

    //    Q--4
//     int arr1[][]={{1,2,3},{4,5,6}};
//     int arr2[][]={{2,6,12},{3,7,1}};
//     int arr3[][]={{0,0,0},{0,0,0}};
//     for (int i=0;i<arr1.length;i++){
//         for (int j=0;j<arr1[i].length;j++){
//             arr3[i][j]=arr1[i][j]+arr2[i][j];
//             System.out.print(arr3[i][j]+" ");
//         }
//         System.out.println(" ");
//     }


//Q-->5 max element
//        int arr[]={1,44,35,67,89,90,23};
//        int max=0;
//        for (int e:arr){
//            if (e>max){
//                max=e;
//            }
//        }
//        System.out.println("maximum of array is:"+max);

        //Q--6 sort an array or not
        boolean isSorted=true;
        int arr[]= {2, 3, 6, 8};
        for (int i=0;i<arr.length;i++){
            if(arr[i]>arr[i+1]){
                isSorted=false;
                break;
            }
        }
        if (isSorted){
            System.out.println("array is sorted ");
        }
else {
            System.out.println("array is not sorted");
        }
    }
}
