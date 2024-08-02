public class practice26_methOverloading {
    public static void foo(){
        System.out.println("good morning bro!");
    }
    public static void foo(int a){
        System.out.println("good morning "+a + "bro!");
    }
    public static void foo(int a,int b){
        System.out.println("good morning"+a+"bro!");
        System.out.println("good morning "+b+"bro!");
    }
    public static void main(String[] args) {
        foo();
        foo(4);
        foo(5,8);
    }
}
