// create a class sphere and use getters and setters to set its radius

class sphere{
    private int radius;
    public int getradius(){
        return radius;
    }
    public void setradius(int radius){
        this.radius=radius;
    }
    public double spherearea(){
        return 4*Math.PI*radius*radius;
    }
}
public class Java_5_Sphere {
    public static void main(String[] args) {
        sphere s = new sphere();
        s.setradius(5);
        System.out.println(s.getradius());
        System.out.println(s.spherearea());
    }
}
