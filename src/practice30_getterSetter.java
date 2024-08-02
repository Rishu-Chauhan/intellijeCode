class myEmployee{
   private int id;
     private String name ;
    public String getName(){
        return name ;
    }
    public void setName(String n){
        name=n;
    }
    public void setId(int i){
        id=i;
    }
    public int getId(){
        return id;
    }
}

public class practice30_getterSetter {
    public static void main(String[] args) {
        myEmployee rishu=new myEmployee();
    rishu.setName("CodeWithRishu");
        System.out.println(rishu.getName());

    }
}
