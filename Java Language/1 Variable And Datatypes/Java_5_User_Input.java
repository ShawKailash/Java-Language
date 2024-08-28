import java.util.Scanner;
public class Java_5_User_Input {
    public static void main(String[] args) {
        System.out.println("taking input from user ");
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number a is ");
        int a = sc.nextInt();
        System.out.println("enter number b is ");
        int b = sc.nextInt();
        int sum = a+b;
        System.out.println("the sum is ");
        System.out.println(sum);

        System.out.println("enter number c is ");
        float c = sc.nextFloat();
        System.out.println("enter number d is ");
        float d = sc.nextFloat();
        float sum1 = c+d;
        System.out.println("the sum1 is ");
        System.out.println(sum1);
        
        System.out.println("boolean ");
        boolean b1 = sc.hasNextInt();
        System.out.println(b1);
        
        Scanner sc1 = new Scanner(System.in);
        System.out.println("string ");
        String str = sc1.next();
        System.out.println(str);

        Scanner sc2 = new Scanner(System.in);
        System.out.println("string line ");
        String str1 = sc2.nextLine();
        System.out.println(str1);
    }
}
