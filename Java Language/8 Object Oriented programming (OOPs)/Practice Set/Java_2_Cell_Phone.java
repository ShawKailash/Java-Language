// create a class cellphone with method to print "ringing...", "vibrating..." etc

class cellphone{
    public void ringing(){
        System.out.println("ringing...");
    }
    public void vibrating(){
        System.out.println("vibrating...");
    }
    public void callfriend(){
        System.out.println("call karan");
    }
}
public class Java_2_Cell_Phone {
    public static void main(String[] args) {
        cellphone realme = new cellphone();
        realme.callfriend();
        realme.ringing();
        realme.vibrating();
    }
}
