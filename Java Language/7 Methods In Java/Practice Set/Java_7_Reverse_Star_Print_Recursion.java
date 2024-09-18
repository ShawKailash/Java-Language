// write a function to print the following pattern with recursion
// * * * *
// * * *
// * *
// *

public class Java_7_Reverse_Star_Print_Recursion {
    static void star_reverse_recursion(int n){
        if(n>0)
        {
            for(int i=0;i<n;i++)
            {
                System.out.print("*");
            }
            System.out.println();
            star_reverse_recursion(n-1);
        }
    }
    public static void main(String[] args) {
        star_reverse_recursion(4);
    }
}
