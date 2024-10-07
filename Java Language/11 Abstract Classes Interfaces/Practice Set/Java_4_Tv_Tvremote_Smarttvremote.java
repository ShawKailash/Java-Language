// create an interface tvremote and use it to inherit another interface smarttvremote
// to create a class tv which implement tvremote and smarttvremote ibterface

interface tvremote{
    void remote();
    void remotetype();
    void remotecolour();
}
interface smarttvremote{
    void smartremote();
    void smartremotetype();
    void smartremotecolour();
}
class tv implements tvremote, smarttvremote{
    void smarttv(){
        System.out.println("smart tv");
    }
    public void remote(){
        System.out.println("normal remote");
    }
    public void remotetype(){
        System.out.println("single connect remote");
    }
    public void remotecolour(){
        System.out.println("black");
    }
    public void smartremote(){
        System.out.println("smart remote screen touch");
    }
    public void smartremotetype(){
        System.out.println("multiple connect remote");
    }
    public void smartremotecolour(){
        System.out.println("high quality colour blue");
    }
}
public class Java_4_Tv_Tvremote_Smarttvremote {
    public static void main(String[] args) {
        tvremote tr = new tv();
        tr.remote();
        tr.remotetype();
        tr.remotecolour();
        smarttvremote str = new tv();
        str.smartremote();
        str.smartremotetype();
        str.smartremotecolour();
        tv t = new tv();
        t.remote();
        t.remotetype();
        t.remotecolour();
        t.smartremote();
        t.smartremotetype();
        t.smartremotecolour();
        t.smarttv();
    }
}
