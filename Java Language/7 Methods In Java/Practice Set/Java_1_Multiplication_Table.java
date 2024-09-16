// write a java method to print multiplication table of a number n

public class Java_1_Multiplication_Table {
    static void multiplication(int n){
        for(int i=1;i<=10;i++)
        {
            System.out.format("%d X %d = %d\n",n,i,n*i);
        }
    }
    public static void main(String[] args) {
        multiplication(10);
    }
}
