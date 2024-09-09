// write a java program to print multiplication table of 10 in reverse order

public class Java_4_Multiplication_Table_Reverse {
    public static void main(String[] args) {
        System.out.println("multiplication table reverse");
        int n=10;
        for(int i=10;i>=1;i--)
        {
            System.out.printf("%d X %d = %d\n",n,i,n*i);
        }
    }
}
