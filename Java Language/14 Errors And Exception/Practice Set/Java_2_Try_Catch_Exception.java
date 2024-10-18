// writea java program that prints "haha" during arithmetic
// exception and "hehe" during an illegal argument exception

public class Java_2_Try_Catch_Exception {
    public static void main(String[] args) {
        try{
            int a=6/0;
        }
        catch (IllegalArgumentException e){
            System.out.println("hehe");
        }
        catch (ArithmeticException e){
            System.out.println("haha");
        }
    }
}
