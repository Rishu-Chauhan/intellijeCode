class myThr1 extends Thread{
    public myThr1(String name){
        super(name);
    }
    public void run(){
        int i=0;
        while(i<10){
            System.out.println("Thank you"+ this.getName());
        }
    }
}
public class priorityInthread {
    public static void main(String[] args) {
        myThr1 t1 =new myThr1("Rishu");
        myThr1 t2 =new myThr1("Akash");
        myThr1 t3 =new myThr1("Sandeep");
        myThr1 t4 =new myThr1("Pratap");
        myThr1 t5 =new myThr1("Yogesh");
        t5.setPriority(Thread.MAX_PRIORITY);
        t1.setPriority(Thread.MIN_PRIORITY);
        t2.setPriority(Thread.MIN_PRIORITY);
        t3.setPriority(Thread.MIN_PRIORITY);
        t4.setPriority(Thread.MIN_PRIORITY);

        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();





    }
}
