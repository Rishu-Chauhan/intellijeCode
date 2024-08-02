interface camera{
    void takeSnap();
    void recordVideo();
}
interface wifi{
    String [] getNetwork();
    void connectToNetwork(String network);
}
class myCellPhone{
    void callNumber(int phoneNumber){
        System.out.println("Calling"+phoneNumber);
    }
    void pickCall(){
        System.out.println("Connecting...");
    }
}
class mySmartPhone extends myCellPhone implements camera,wifi{
    public void takeSnap(){
        System.out.println("taking snap..");
    }
    public void recordVideo(){
        System.out.println("recording video..");
    }
    public String [] getNetwork(){
        System.out.println("getting list of networks");
        String[] networkList={"Harry","Rohan","Rinku","Rishu"};
        return networkList;
    }
    public void connectToNetwork(String network){
        System.out.println("connecting to..."+network);
    }
}
public class interface1 {
    public static void main(String[] args) {
        mySmartPhone ms=new mySmartPhone();
        String[] ar=ms.getNetwork();
       for(String item:ar){
           System.out.println(item);
       }
       ms.takeSnap();
       ms.recordVideo();
    }
}
