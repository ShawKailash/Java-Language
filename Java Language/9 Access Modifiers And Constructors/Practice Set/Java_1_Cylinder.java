// create a class cylinder and use getters and setters to set its radius and height

class cylinder{
    private int radius;
    private int height;
    public int getradius(){
        return radius;
    }
    public void setradius(int radius){
        this.radius=radius;
    }
    public int getheight(){
        return height;
    }
    public void setheight(int height){
        this.height=height;
    }
}
public class Java_1_Cylinder {
    public static void main(String[] args) {
        cylinder mycylinder = new cylinder();
        mycylinder.setheight(12);
        int h = mycylinder.getheight();
        System.out.println(h);
        mycylinder.setradius(6);
        int r = mycylinder.getradius();
        System.out.println(r);
    }
}
