// overloading a constructor used to initialize a rectangle of
// length 4 and breath 5 for using custom parameters
class constructorrectangle{
    private int length;
    private int breath;
    public constructorrectangle(){
        this.length=4;
        this.breath=5;
    }
    public constructorrectangle(int length, int breath){
        this.length=length;
        this.breath=breath;
    }
    public int getlength(){
        return length;
    }
    public int getbreath(){
        return breath;
    }
}
public class Java_4_Constructor_Rectangle {
    public static void main(String[] args) {
        constructorrectangle r1 = new constructorrectangle();
        System.out.println(r1.getlength());
        System.out.println(r1.getbreath());

        constructorrectangle r2 = new constructorrectangle(4,5);
        System.out.println(r2.getlength());
        System.out.println(r2.getbreath());        
    }
}
