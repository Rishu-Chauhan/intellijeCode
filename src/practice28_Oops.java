
class Employe{
    int id;
    String name;
    public void printDetails(){
        System.out.println("my id is:"+id);
        System.out.println("and my name is:"+name);
    }
}
public class practice28_Oops {
    public static void main(String[] args) {
       Employe harry=new Employe();
       Employe rishu=new Employe();
       harry.id=12;
       harry.name="CodeWitHarry";
       rishu.id=17;
       rishu.name="Rishu Chauhan";
       harry.printDetails();
       rishu.printDetails();
    }
}
