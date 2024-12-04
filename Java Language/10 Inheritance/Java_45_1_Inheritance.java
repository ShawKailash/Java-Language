class base{
    int x;
    public int getx(){
        return x;
    }
    public void setx(int x){
        System.out.println("i am in base and setting x now");
        this.x=x;
    }
}
class derived extends base{
    int y;
    public int gety(){
        return y;
    }
    public void sety(int y){
        this.y=y;
    }
}
public class Java_45_1_Inheritance {
    public static void main(String[] args) {
        base b = new base();
        b.setx(4);
        System.out.println(b.getx());
        derived d = new derived();
        d.setx(5);
        System.out.println(d.getx());
        d.sety(6);
        System.out.println(d.gety());
    }   
}
