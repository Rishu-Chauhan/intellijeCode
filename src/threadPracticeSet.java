class myThr extends Thread{
    public void run(){
        int i=0;
        while(i<40){
            System.out.println("good morning");
            i++;
        }
    }
}
class myThr2 extends Thread{
    public void run(){

        int i=0;
        while(i<40){
            System.out.println("Welcome");
            i++;
//            try{
//                Thread.sleep(millis:200);
//            }
//            catch(InterruptedException e){
//                System.out.println(e);
//            }
        }
    }
}

public class threadPracticeSet {
    public static void main(String []args){
        myThr m1=new myThr();
        myThr2 m2=new myThr2();
        m1.start();
        m2.start();
    }
}
