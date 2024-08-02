class Employee{
    int salary;
    String name;
    public int getSalary(){
        return salary;
    }
    public String getName(){
        return name;
    }
    public void setName(String n){
        name=n;
    }
}
class cellPhone{
    public void ring(){
        System.out.println("Ringing...");
    }
    public void vibrate(){
        System.out.println("vibrating...");
    }
    public void callFriend(){
        System.out.println("Calling Mukul");
    }
}
class square{
    int a;
    public int area(){
        return a*a;
    }
    public int perimeter(){
        return 4*a;
    }
}
class Rec{
    int l;
    int b;
    public int area(){
        return l*b;
    }
    public int peri(){
        return 2*(l+b);
    }
}
public class practice29_OopsSet {
    public static void main(String[] args) {
//        Employee E1=new Employee();
//        E1.setName("CodeWithRishu");
//        String c=E1.getName();
//        System.out.println(c);
//        E1.salary=233;
//        int d=E1.getSalary();
//        System.out.println(d);
//        cellPhone c1=new cellPhone();
//        c1.ring();
//        c1.vibrate();
//        c1.callFriend();
//

        Rec r=new Rec();
        r.l=4;
        r.b=5;
        System.out.println( r.area());
        System.out.println(  r.peri());

    }
}
