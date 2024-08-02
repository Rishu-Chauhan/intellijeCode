class myThread extends Thread{
   public  myThread(String name){
     super(name);
    }
    public void run(){

        System.out.println("Thank you");
//        while(true){
//            System.out.println("I am a thread");
//
//        }
    }
}
public class TheThreadClass {
    public static void main(String[] args) {
myThread t1=new myThread("Rishu");
myThread t2=new myThread("Rinku");
t1.start();
t2.start();
        System.out.println(t1.getId());
        System.out.println(t1.getName());
        System.out.println(t2.getId());
        System.out.println(t2.getName());


    }
}
