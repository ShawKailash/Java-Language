// write a java program to sum first n even number using while loop

public class Java_2_Sum_Even {
    public static void main(String[] args) {
        int n=4;
        int sum=0;
        for(int i=0;i<n;i++)
        {
            sum = sum+(2*i);
        }
        System.out.print("sum of even number is ");
        System.out.println(sum);
    }    
}
