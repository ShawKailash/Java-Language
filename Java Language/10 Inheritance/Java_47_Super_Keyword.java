class ekclass{
    int a;
    public int geta(){
        return a;
    }
    ekclass(int a){
        this.a=a;
    }
}
class doclass extends ekclass{
    doclass(int c){
        super(c);
        System.out.println("i am constructor");
    }
}
public class Java_47_Super_Keyword {
    public static void main(String[] args) {
        ekclass e = new ekclass(5);
        System.out.println(e.geta());
        doclass d = new doclass(45);
        System.out.println(d.geta());
    }
}
