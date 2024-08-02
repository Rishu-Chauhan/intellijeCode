public class practice22_array {
    public static void main(String[] args) {
//      int arr[]={98,45,65,48,39};
//      float arr1[]={25.0f,59.0f,68.0f,94.0f};
//        System.out.println(arr.length);
//        System.out.println(arr1.length);

//        String []arr2={"Rishu","Raman","Rohan","Rinku"};
//        System.out.println(arr2[2]);
//        System.out.println(arr2.length);
//        //displaying an array-->
//        for (int i=0;i<arr2.length;i++){
//            System.out.println(arr2[i]);

            //arraay in reverse order-->
        int arr[]={1,3,5,6,7};

//            for (int i=arr.length-1;i>=0;i--){
//                System.out.println(arr[i]);
//            }

         //   --> for each loop
//        for (int element:arr){
//            System.out.println(element);

        //2d array-->
        int array[][]=new int [2][3];
        array[0][0]=100;
        array[0][1]=101;
        array[0][2]=102;
        array[1][0]=103;
        array[1][1]=104;
        array[1][2]=105;
        System.out.println("printing 2d array:");
        for (int i=0;i<array.length;i++){
            for (int j=0;j<array[i].length;j++){
                System.out.print(array[i][j]);
                System.out.print(" ");
            }
            System.out.println("\n");
        }
    }

    }




