abstract class parent2{
    public parent2(){
        System.out.println("I am constructor of parent2:");
    }
    public void sayHello(){
        System.out.println("hello:");
    }
    abstract public void greet();
    abstract public void greet1();
}
class child2 extends parent2{
  @Override
  public void greet(){
        System.out.println("good morning:");
    }
    @Override
    public void greet1(){
        System.out.println("good afternoon:");
    }
}
abstract class child3 extends parent2{
    public void meth(){
        System.out.println("I am good:");
    }
}
public class abstract_class {
    public static void main(String[] args) {
child2 c=new child2();
c.greet();
c.greet1();
c.sayHello();

    }
}
