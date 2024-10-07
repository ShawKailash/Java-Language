// create a class telephone with ring(), lift() and disconnect() methods
// as abstract methods create another class smarttelephone and demanstrate polymorphism

abstract class telephone{
    abstract void ring();
    abstract void lift();
    abstract void disconnect();
}
class smarttelephone extends telephone{
    void phone(){
        System.out.println("realme");
    }
    void ring(){
        System.out.println("ringing...");
    }
    void lift(){
        System.out.println("lift your phone");
    }
    void disconnect(){
        System.out.println("calling disconnect");
    }
}
public class Java_3_Telephone_Abstract {
    public static void main(String[] args) {
        telephone tp = new smarttelephone();
        tp.ring();
        tp.lift();
        tp.disconnect();
        smarttelephone stp = new smarttelephone();
        stp.phone();
        stp.ring();
        stp.lift();
        stp.disconnect();
    }
}
