class negativeradiusexception extends Exception{
    @Override
    public String toString(){
        return "radius cannot be negative";
    }
    @Override
    public String getMessage(){
        return "radius is positive";
    }
}
public class Java_84_Throw_Throws {
    public static double area(int r) throws negativeradiusexception{
        if(r<0){
            throw new negativeradiusexception();
        }
        double result = Math.PI*r*r;
        return result;
    }
    public static int divide(int a, int b) throws ArithmeticException{
        int result=a/b;
        return result;
    }
    public static void main(String[] args) {
        try{
            double ar=area(6);
            System.out.println(ar);
            
            int c=divide(6,0);
            System.out.println(c);
        }
        catch(Exception e){
            System.out.println("exception");
        }
    }
}

