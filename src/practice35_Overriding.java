class A{
    int a;
    public void meth2(){
        System.out.println("I am method2 of class A");
    }
}
class B extends A{
    @Override
    public void meth2(){
        System.out.println("I am method2 of class B");
    }
    public void meth3(){
        System.out.println("i am method3 of class B");
    }
}
public class practice35_Overriding {
    public static void main(String[] args) {
       A a=new A();
       a.meth2();
       B b=new B();
       b.meth2();
       b.meth3();
    }
}
