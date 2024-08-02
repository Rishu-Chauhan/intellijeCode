class myThreadRunnable1 implements Runnable{
    public void run(){
        int i=0;
        while(i<10){
            System.out.println("I am cooking");
            i++;
        }
    }
}
class myThreadRunnable2 implements Runnable{
    public void run(){
        int i=0;
        while(i<10){
            System.out.println("I am thread2");
            i++;
        }
    }
}
public class thread_runnable_interface {
    public static void main(String[] args) {
        myThreadRunnable1 bullet1=new myThreadRunnable1();
        Thread gun1=new Thread(bullet1);
        myThreadRunnable2 bullet2=new myThreadRunnable2();
        Thread gun2=new Thread(bullet2);
        gun1.start();
        gun2.start();
    }
}
