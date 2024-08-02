public class practice21_Patt_Rec {
    public static void printPattern(int n){
        if(n==0){
            return;
        }
        for(int i=0;i<n;i++){
            System.out.print("*");
        }
        printPattern(n-1);
    }
    public static void main(String[] args) {
int n=4;
printPattern(n);
    }
}
