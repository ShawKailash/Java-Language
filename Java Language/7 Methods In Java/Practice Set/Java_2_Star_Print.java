// write a java program using function to print the following pattern
// *
// * *
// * * *
// * * * *

public class Java_2_Star_Print {
    static void star(int n){
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String[] args){
        star(8);
    }
}