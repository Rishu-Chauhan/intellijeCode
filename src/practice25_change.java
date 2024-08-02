public class practice25_change {
    public static void chan(int a){
        a=98;
    }
    public static void chang(int arr[]){
        arr[0]=90;
    }
    public static void main(String[] args) {
        int x=45;
        chan(x);
        System.out.println(x);

        //for aaray-->
        int marks[]={29,76,89,65};
        chang(marks);
        System.out.println(marks[0]);
    }
}
