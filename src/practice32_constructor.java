import java.util.concurrent.Callable;

class Cylinder1{
    private int radius ;
    private int height ;
    public Cylinder1(int radius,int height){
        this.radius=radius;
        this.height=height;
    }
    public int getRadius(){
        return radius;
    }
    public void setRadius(int radius){
        this.radius=radius;
    }
    public int getHeight(){
        return height;
    }
    public void setHeight(int height){
        this.height=height;
    }
    public double area(){
        return 2*3.14*radius*height+3.14*radius*radius*height;
    }
    public double volume(){
        return 3.14*radius*radius*height;
    }

}
public class practice32_constructor {
    public static void main(String[] args) {
        Cylinder1 c1=new Cylinder1(9,12);
        System.out.println(c1.getRadius());
        System.out.println(c1.getHeight());
        System.out.println(c1.area());
        System.out.println(c1.volume());


            }
        }


