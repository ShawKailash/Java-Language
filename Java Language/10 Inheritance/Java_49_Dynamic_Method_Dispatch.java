class phone{
    public void showtime(){
        System.out.println("time is 8 pm");
    }
    public void on(){
        System.out.println("turning on phone");
    }
}
class smartphone extends phone{
    public void music(){
        System.out.println("playing music");
    }
    public void on(){
        System.out.println("turn on smartphone");
    }
}
public class Java_49_Dynamic_Method_Dispatch {
    public static void main(String[] args) {
        phone obj = new smartphone();
        obj.showtime();
        obj.on();
        // obj.music();    ---> not allowed
        smartphone sp = new smartphone();
        sp.music();
    }
}
