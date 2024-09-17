// write a recursive function to calculate sum of first n natural number

public class Java_3_Sum_Calculate {
    static int sumrec(int n){
        if(n==1)
        {
            return 1;
        }
        else
        {
            return n+sumrec(n-1);
        }
    }
    public static void main(String[] args) {
        int a=sumrec(3);
        System.out.println(a);
    }
}
