interface Bicycle{
    void applyBrake(int decrement);
    void speedUp(int increment);
}
class AvonCycle implements Bicycle{
    int speed=7;
   public void applyBrake(int decrement){
        speed =speed-decrement;
    }
  public  void speedUp(int increment){
        speed =speed+increment;
    }
}
public class Interface {
    public static void main(String[] args) {
AvonCycle a=new AvonCycle();
      a.speedUp(4);
        System.out.println("increasing the speed with speed="+a.speed);
        a.applyBrake(4);
        System.out.println("Decreasing the speed with speed="+a.speed);
            }
        }


