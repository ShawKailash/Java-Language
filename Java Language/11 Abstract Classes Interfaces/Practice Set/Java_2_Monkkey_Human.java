// create a class monkey with jump() and bite() methods create a class human which inherits
// this monkey class and implements basicanimal interface with eaat() and sleep() methods

class monkey{
    void jump(){
        System.out.println("jumping...");
    }
    void bite(){
        System.out.println("biting.....");
    }
}
interface basicanimal{
    void eat();
    void sleep();
}
class human extends monkey implements basicanimal{
    void speak(){
        System.out.println("hello kailash");
    }
    public void eat(){
        System.out.println("eating");
    }
    public void sleep(){
        System.out.println("sleeping");
    }
}
public class Java_2_Monkkey_Human {
    public static void main(String[] args) {
        monkey m = new human();
        m.jump();
        m.bite();
        basicanimal ba = new human();
        ba.eat();
        ba.sleep();
        human h = new human();
        h.jump();
        h.bite();
        h.speak();
        h.eat();
        h.sleep();
    }
}
