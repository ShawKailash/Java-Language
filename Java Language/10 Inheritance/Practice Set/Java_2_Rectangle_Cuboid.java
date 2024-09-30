// create a class rectangle and use inheritance to create another 
// class cuboid try to keep it as close to real world scenario as possible

class rectangle{
    public int length;
    public int breath;
    rectangle(int l, int b){
        System.out.println("it is rectangle constructor");
        this.length=l;
        this.breath=b;
    }
    public int area(){
        return this.length*this.breath;
    }
}
class cuboid extends rectangle{
    public int height;
    cuboid(int l , int b, int h){
        super(l,b);
        System.out.println("it is cuboid constructor");
        this.height=h;
    }
    public int cube(){
        return 2*(this.length+this.breath+this.height);
    }
}
public class Java_2_Rectangle_Cuboid {
    public static void main(String[] args) {
        rectangle r = new rectangle(3,4);
        System.out.println(r.area());
        cuboid c = new cuboid(2, 3, 4);
        System.out.println(c.area());
        System.out.println(c.cube());

    }
}
