// write a function to print n th term of fibonacci series using recursion

public class Java_5_Fibonacci_Series {
    static int fib(int n){
        if(n==1 ||n==2)
        {
            return n-1;
        }
        else
        {
            return fib(n-1)+fib(n-2);
        }
    }
    public static void main(String[] args) {
        int result=fib(7);
        System.out.println(result);
    }
}