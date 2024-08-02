class circle{
    int radius;
    circle(int radius){
        this.radius=radius;
    }
    public double area(){
        return Math.PI*radius*radius;
    }
}
class cylinder extends circle{
    int height;
    int radius;
    cylinder(int height, int radius){
        super(radius);
        this.height=height;
    }
  public   double volume(){
        return Math.PI*radius*radius*height;
  }
}
public class practice_set2 {
    public static void main(String[] args) {
        circle c=new circle(7);
        cylinder c1=new cylinder(8,7);


    }
}
