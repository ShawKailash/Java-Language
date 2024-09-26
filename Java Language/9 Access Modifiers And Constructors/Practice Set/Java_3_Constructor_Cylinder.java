// create a class cylinder and use getters and setters to set its radius and height use a constructor 

class constructorcylinder{
    private int radius;
    private int height;
    public constructorcylinder(int radius, int height){
        this.height=height;
        this.radius=radius;
    }
    public int getheight(){
        return height;
    }
    public int getradius(){
        return radius;
    }
}
public class Java_3_Constructor_Cylinder {
    public static void main(String[] args) {
        constructorcylinder c1 = new constructorcylinder(6, 12);
        System.out.println(c1.getradius());
        System.out.println(c1.getheight());
    }
}
