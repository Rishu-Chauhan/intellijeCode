class phone{
    public void greet(){
        System.out.println("Good morning:");
    }
    public void on(){
        System.out.println("turning on phone:");
    }
}
class smartPhone extends phone{
    public void welcome(){
        System.out.println("Welcome to home:");
    }
    public void on(){
        System.out.println("turning on smartphone:");
    }
}
public class practice36_Dynamic_method_dispatch {
    public static void main(String[] args) {
        phone obj=new smartPhone();
        obj.greet();
        obj.on();
    }
}
