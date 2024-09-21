public class Java_34_Recursion {
    static int factorial(int n)
    {
        if(n==0 || n==1)
        {
            return 1;
        }
        else
        {
            return n*factorial(n-1);
        }
    }
    static int factorial_iterative(int n){
        if(n==0 || n==1)
        {
            return 1;
        }
        else
        {
            int product = 1;
            for(int i=1;i<=n;i++)
            {
                product *=i;
            }
            return product;
        }
    }
    public static void main(String[] args) {
        int x=5;
        System.out.printf("the value of factorial %d is %d\n",x,factorial(x));
        System.out.printf("the value of factorial_iterative %d is %d\n",x,factorial_iterative(x));
    }
}
