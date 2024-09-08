// write a java program to print the fillowing pattern
// *****
// ****
// ***
// **
// *

public class Java_1_Star_Print {
    public static void main(String[] args) {
        System.out.println("star print");
        for(int i=5;i>0;i--)
        {
            for(int j=0;j<i;j++)
            {
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }
}
