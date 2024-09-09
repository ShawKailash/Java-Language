// write a java program to calculate the sum of the number
// occuring in the multiplication table of 8

public class Java_6_Sum_8_Table {
    public static void main(String[] args) {
        int n=8;
        int sum=0;
        for(int i=1;i<=10;i++)
        {
            sum+=n*i;
        }
        System.out.println("sum of 8 table is "+sum);
    }
}
