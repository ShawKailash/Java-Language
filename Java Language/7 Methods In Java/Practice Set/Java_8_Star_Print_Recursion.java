// write a java program using function to print the following pattern with recursion
// *
// * *
// * * *
// * * * *

public class Java_8_Star_Print_Recursion {
    static void star_recursion(int n){
        if(n>0)
        {
            star_recursion(n-1);
            for(int i=0;i<n;i++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        star_recursion(4);
    }
}
