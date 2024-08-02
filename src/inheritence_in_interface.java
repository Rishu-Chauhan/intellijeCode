interface sampleInterface{
    void meth1();
    void meth2();
}
interface childSampleInterface extends sampleInterface{
    void meth3();
    void meth4();
}
class myClass implements childSampleInterface{
    public void meth1(){
        System.out.println("I am method 1..");
    }
    public void meth2(){
        System.out.println("I am method 2..");
    }
    public void meth3(){
        System.out.println("I am method 3..");
    }
    public void meth4(){
        System.out.println("I am method 4..");
    }
}
public class inheritence_in_interface {
    public static void main(String[] args) {
       myClass obj=new myClass();
       obj.meth1();
       obj.meth2();
       obj.meth3();
       obj.meth4();
    }
}
