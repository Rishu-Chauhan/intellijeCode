import com.sun.security.jgss.GSSUtil;

/*abstract class pen{
    abstract void write();
    abstract void refill();
}
class fountain extends pen{
    void write(){
        System.out.println("writing..");
    }
    void refill(){
        System.out.println("refilling..");
    }
    void changeNib(){
        System.out.println("changing the nib..");
    }
}
public class practice_set_abstrct {
    public static void main(String[] args) {
        fountain obj=new fountain();
        obj.changeNib();
    }
}

class monkey{
    void jump(){
        System.out.println("jumping..");
    }
    void bite(){
        System.out.println("biting..");
    }
}
interface BasicAnimal{
    void eat();
    void sleep();
}
class human extends monkey implements BasicAnimal{
    void speak(){
        System.out.println("hello sir.");
    }
    public void eat(){
        System.out.println("eating.");
    }
    public void sleep(){
        System.out.println("sleeping.");
    }
}
public class practice_set_abstrct {
    public static void main(String[] args) {
    human hum=new human();
        hum.sleep();
    hum.eat();
    monkey m1=new human();
    m1.jump();
    m1.bite();
    BasicAnimal b=new human();
    b.eat();
    b.sleep();
    }
 }


abstract class telephone {
    abstract void ring();
    abstract void left();
    abstract void disconect();
}
class smartphone extends telephone{
    void ring(){
        System.out.println("ringing..");
    }
    void left(){
        System.out.println("lifting..");
    }
    void disconect(){
        System.out.println("disconecting..");
    }
    void reconnecting(){
        System.out.println("reconnecting..");
    }
}
public class practice_set_abstrct {
    public static void main(String[] args) {
    telephone tel=new smartphone();
    tel.ring();
    tel.left();
    tel.disconect();
   // tel.reconnecting();-->this method will not run due to pollymorphism..
    }
    }


interface TVRemote{
    void watch();
    void movie();
}
interface smartTVRemote extends TVRemote{
    void best();
    void bad();
}
class myRemote implements smartTVRemote{
    public void watch(){
        System.out.println("watching the TV.");
    }
    public void movie(){
        System.out.println("seeing the movie..");
    }
    public void best(){
        System.out.println("best movie");
    }
    public void bad(){
        System.out.println("bad movie");
    }
}
public class practice_set_abstrct {
    public static void main(String[] args) {
    myRemote r=new myRemote();
    r.bad();
    r.best();
    r.movie();
    r.watch();
    }
    }
    */

