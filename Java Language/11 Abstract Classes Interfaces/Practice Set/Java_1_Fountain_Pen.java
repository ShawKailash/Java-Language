// create an abstract class pen with method write() and refill()
// as abstract methods use for pen class to create a concrete
// class fountain with additional method changenib()

abstract class pen{
    abstract void write();
    abstract void refill();
}
class fountainpen extends pen{
    void write(){
        System.out.println("write");
    }
    void refill(){
        System.out.println("refill");
    }
    void changenib(){
        System.out.println("change the nib");
    }
}
public class Java_1_Fountain_Pen {
    public static void main(String[] args) {
        fountainpen fp = new fountainpen();
        fp.changenib();
        fp.write();
        fp.refill();
    }
}
