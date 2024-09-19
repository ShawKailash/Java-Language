public class Java_10_Average_Sum_Iterative {
    static int sum_natural_number(int n){
        int sum=0;
        for(int i=0;i<=n;i++)
        {
            sum+=i;
        }
        return sum;
    }
    public static void main(String[] args) {
        int a=sum_natural_number(10);
        System.out.println(a);
    }
}
