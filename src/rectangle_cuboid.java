
class rec{
    int length;
    int breadth;
    rec(int l,int b){
        this.length=l;
        this.breadth=b;
    }
    public double area(){
        System.out.println("I am the area of rectangle:");
        return length*breadth;
    }
    public int per(){
        System.out.println("I am the perimeter of rectangle:");
        return 2*(length+breadth);
    }
}
class cuboid extends rec{
    int heigth;
    cuboid(int h,int l,int b){
         super(l,b);
        this.heigth=h;
    }
    public int area1(){
        System.out.println("I am the area of cuboid:");
       return 2*(length*breadth+breadth*heigth+length*heigth);
    }
    public int per1(){
        System.out.println("I am the perimeter of cuboid: ");
        return 4*(length+breadth+heigth);
    }
        }
public class rectangle_cuboid {
    public static void main(String[] args) {
rec r=new rec(4,5);
cuboid c=new cuboid(4,4,5);
    }
}
