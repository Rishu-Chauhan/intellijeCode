class EkClass{
    int a;
    EkClass(int a){
        this.a=a;
    }
    public int getA(){
        return a;
    }
    public int returnOne(){
        return 1;
    }
}
class DoClass extends EkClass{
    DoClass(int c){
        super(c);
        System.out.println("I am a constructor:");
    }
}
public class practice34_this_super {
    public static void main(String[] args) {
EkClass e=new EkClass(65);
DoClass d=new DoClass(6);
        System.out.println(e.getA());

    }
}
