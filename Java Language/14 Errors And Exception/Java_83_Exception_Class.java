import java.util.Scanner;

class myexception extends Exception{
    @Override
    public String toString(){
        return "i am toString";
    }
    @Override
    public String getMessage(){
        return "i am getMessage";
    }
}
public class Java_83_Exception_Class {
    public static void main(String[] args) {
        int a;
        Scanner sc = new Scanner(System.in);
        a=sc.nextInt();
        if(a<9)
        {
            try{
                throw new ArithmeticException("this is an exception");
            }
            catch(Exception e){
                System.out.println(e.getMessage());
                System.out.println(e.toString());
                e.printStackTrace();
                System.out.println("finished");
            }
            System.out.println("yes finished");
        }
    }
}
