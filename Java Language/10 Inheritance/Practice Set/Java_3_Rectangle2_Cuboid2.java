// create a class rectangle and to create another class cuboid  used geter and seter

class rectangle2{
    public int length;
    public int breath;
    public int getlenth(){
        return length;
    }
    public void setlenth(int l){
        this.length=l;
    }
    public int getbreath(){
        return breath;
    }
    public void setbreath(int b){
        this.breath=b;
    }
    public int area(){
        System.out.println("it is rectangle constructor");
        return this.length*this.breath;
    }
}
class cuboid2 extends rectangle2{
    public int height;
    public int getheight(){
        return height;
    }
    public void setheight(int h){
        this.height=h;
    }
    public int cube(){
        System.out.println("it is cuboid constructor");
        return 2*(this.length+this.breath+this.height);
    }
}
public class Java_3_Rectangle2_Cuboid2 {
    public static void main(String[] args) {
        rectangle2 r = new rectangle2();
        r.setbreath(2);
        r.setlenth(3);
        System.out.println(r.getbreath());
        System.out.println(r.getlenth());
        System.out.println(r.area());
        cuboid2 c = new cuboid2();
        c.setbreath(2);
        c.setlenth(3);
        c.setheight(4);
        System.out.println(c.getbreath());
        System.out.println(c.getlenth());
        System.out.println(c.getheight());
        System.out.println(c.area());
        System.out.println(c.cube());

    }
}
