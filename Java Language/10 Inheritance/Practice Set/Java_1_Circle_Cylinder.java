// create a class circle and use inheritance to create another class cylinder from it

class circle{
    public int radius;
    circle(int r){
        System.out.println("i am circle constructor");
        this.radius=r;
    }
    public double area(){
        return Math.PI*this.radius*this.radius;
    }
}
class cylinder extends circle{
    public int height;
    cylinder(int r, int h){
        super(r);
        System.out.println("i am cylinder constructor");
        this.height=h;
    }
    public double volume(){
        return Math.PI*this.radius*this.radius*this.height;
    }
}
public class Java_1_Circle_Cylinder {
    public static void main(String[] args) {
        circle c = new circle(2);
        System.out.println(c.area());
        cylinder cy = new cylinder(2,3);
        System.out.println(cy.area());
        System.out.println(cy.volume());
    }
}
