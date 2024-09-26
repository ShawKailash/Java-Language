// use 1 to calculate surface area of volume of the cylinder

class surface_area_cylinder{
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
    public double surfacearea(){
        return 2*Math.PI*radius*radius+2*Math.PI*radius*height;
    }
    public double volume(){
        return Math.PI*radius*radius*height;
    }
}
public class Java_2_Surface_Area_Cylinder {
    public static void main(String[] args) {
        surface_area_cylinder area = new surface_area_cylinder();
        area.setheight(12);
        int h=area.getheight();
        System.out.println(h);
        area.setradius(9);
        int r=area.getradius();
        System.out.println(r);
        System.out.println(area.surfacearea());
        System.out.println(area.volume());
    }
}
