// create a class rectangle with a method to initialize its length, breath, calculating area, perimeter etc

class rectangle{
    int length;
    int breath;
    public int rectangle(){
        return length*breath;
    }
    public int perimeter(){
        return 2*(length+breath);
    }
}
public class Java_4_Rectangle {
    public static void main(String[] args) {
        rectangle rt = new rectangle();
        rt.length=3;
        rt.breath=5;
        System.out.println(rt.rectangle());
        System.out.println(rt.perimeter());
    }
}
