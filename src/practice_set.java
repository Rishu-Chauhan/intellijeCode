public class practice_set {
    public static void multi(int n){
        for (int i=1;i<=10;i++){
            System.out.format("%d*%d=%d\n",i,n,n*i);
        }

    }
    public static void pattern(int n){
       for (int i=0;i<n;i++){
           for (int j=0;j<i+1;j++){
               System.out.print("*");
           }
           System.out.println();
       }
    }
    public static int sum(int n){
        if(n==1){
            return 1;
        }
        return n+sum(n-1);
    }
    public static void pattern1(int n){
        for(int i=n;i>0;i--){
            for (int j=0;j<i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
public static void pattern2(int n){
    for (int i=0;i<n;i++){
        for (int j=0;j<i+1;j++){
            System.out.print("*");
        }
        System.out.println();
    }
    for(int i=n;i>0;i--){
        for (int j=0;j<i;j++){
            System.out.print("*");
        }
        System.out.println();
    }
}
public static int fib(int n){
        if(n==1){
            return 0;
        }
        else if (n==2){
            return 1;
        }
        else{
        return    fib(n-1)+fib(n-2);
        }
}
public static int avg(int ...arr){
        int result=0;
        for (int a:arr){
            result +=a;
        }
        return result;
}
//celsius into fahrenhright
    public static double tempConv(double celcius){
        return (celcius*9/5)+32;
    }
    public static void main(String[] args) {
        multi(5);
        pattern(4);
        int c=sum(5);
        System.out.println(c);
        pattern1(4);
        pattern2(5);
        int v =fib(9);
        System.out.println(v);
   int d=avg(2,4,5,6,7);
        System.out.println(d);
        double e=tempConv(25);
        System.out.println(e);

    }
}
