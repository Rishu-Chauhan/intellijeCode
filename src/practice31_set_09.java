class Cylinder{
   private int radius;
   private int height;
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
        return 2*3.14*radius*height+2*3.14*radius*radius;
    }
    public double volume(){
        return 3.14*radius*radius*height;
    }

}
public class practice31_set_09 {
    public static void main(String[] args) {
        Cylinder c=new Cylinder();
        c.setHeight(4);
        int h=c.getHeight();
        System.out.println("height is setet by " + h);
        c.setRadius(3);
        int r= c.getRadius();
        System.out.println("Radius is setet by " + r);
        System.out.println( "the area of cylinder is: "+c.area());
        System.out.println( "the volume of cylinder is: "+c.volume());
    }
}
