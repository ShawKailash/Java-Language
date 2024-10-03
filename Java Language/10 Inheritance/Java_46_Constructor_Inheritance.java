class base1{
    base1(){
        System.out.println("i am base1 constructor");
    }
    base1(int x){
        System.out.println("i am overloading base1 constructor is "+x);
    }
}
class derived1 extends base1{
    derived1(){
        System.out.println("i am derived1 constructor");
    }
    derived1(int x, int y){
        super(x);
        System.out.println("i am overloading derived1 constructor is "+y);
    }
}
class childofderived extends derived1{
    childofderived(){
        System.out.println("i am childofderived constructor");
    }
    childofderived(int x, int y, int z){
        super(x, y);
        System.out.println("i am overloading childofderived constructor is "+z);
    }
}
public class Java_46_Constructor_Inheritance {
    public static void main(String[] args) {
        childofderived c = new childofderived();
        childofderived c1 = new childofderived(2, 3, 4);

    }
}
