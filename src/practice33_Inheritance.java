class Base{
    int x;
    public int getX(){
        return x;
    }
    public void setX(int x){
        this.x=x;
    }
}
class Derived{
    int y;
    public int getY(){
        return y;
    }
    public void setY(int y){
        this.y=y;
    }

}
public class practice33_Inheritance {
    public static void main(String[] args) {
        Base b=new Base();
        b.setX(6);
        System.out.println(b.getX());
        Derived d=new Derived();
        d.setY(7);
        System.out.println(d.getY());
    }
}

