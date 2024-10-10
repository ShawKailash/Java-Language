interface mycamera{
    void takesnap();
    void reecordvideo();
    private void greet(){
        System.out.println("good morning");
    }
    default void record4kvideo(){
        greet();
        System.out.println("recording 4k ......");
    }
}
interface mywifi{
    String[] getnetwork();
    void connecttonetwork(String network);
}
class mycellphone{
    void callnumber(int phonenumber){
        System.out.println("calling "+phonenumber);
    }
    void pickall(){
        System.out.println("connecting ...");
    }
}
class mysmartphone extends mycellphone implements mywifi, mycamera{
    public void takesnap(){
        System.out.println("taking snap");
    }
    public void reecordvideo(){
        System.out.println("creating video");
    }
    public String[] getnetwork(){
        System.out.println("getting list of network");
        String[] networklist = {"kailash", "karan", "komal"};
        return networklist;
    }
    public void connecttonetwork(String network){
        System.out.println("connecting to "+network);
    }
}
public class Java_57_Default_Method {
    public static void main(String[] args) {
        mysmartphone msp = new mysmartphone();
        msp.takesnap();
        msp.reecordvideo();
        msp.record4kvideo();
        msp.callnumber(1234567890);
        msp.pickall();
        String[] ar = msp.getnetwork();
        for(String item:ar)
        {
            System.out.println(item);
        }
        msp.connecttonetwork("kailash");
    }
}
