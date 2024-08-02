interface DemoAno{
    void meth1(int a);
}
public class lambdaExpretion {
    public static void main(String []args){
        DemoAno obj=(a)->{
            System.out.println("I am method of lambda "+a);

        };
        obj.meth1(6);
    }
}
