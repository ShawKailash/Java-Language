// create a class circle with a method to initialize its radius, diameter etc

class circle{
    int diameter;
    public int radius(){
        return diameter/2;
    }
}
public class Java_6_Circle {
    public static void main(String[] args) {
        circle ci = new circle();
        ci.diameter=34;
        System.out.println(ci.radius());
    }
}
