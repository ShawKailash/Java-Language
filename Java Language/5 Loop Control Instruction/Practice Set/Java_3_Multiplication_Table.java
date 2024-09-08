// write a java program to print multiplication table of a given number n

public class Java_3_Multiplication_Table {
    public static void main(String[] args) {
        System.out.println("multiplication table");
        int n=5;
        for(int i=1;i<=10;i++)
        {
            System.out.printf("%d X %d = %d\n",n,i,n*i);
        }
    }
}
