// write a program to find factorial of a given number using for loop

public class Java_5_Factorial_Number {
    public static void main(String[] args) {
        int n=5;
        int factorial=1;
        for(int i=1;i<=n;i++)
        {
            factorial *=i;
        }
        System.out.printf("factorial number %d is %d",n,factorial);
    }
}
