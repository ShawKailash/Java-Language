// write a function to print the following pattern
// * * * *
// * * *
// * *
// *

public class Java_4_Reverse_Star_Print {
    static void reversestar(int n){
        for(int i=n;i>=0;i--)
        {
            for(int j=0;j<i;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        reversestar(4);
    }
}
