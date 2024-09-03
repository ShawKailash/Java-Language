import java.util.Scanner;
public class Java_13_String {
    public static void main(String[] args) {
        String name = new String("Kailash");
        System.out.println(name);
        String name1="karan";
        System.out.print(name+" ");
        System.out.println(name1);
        int a=6;
        float b=34.56f;
        System.out.printf("the value of a is %d and value of b is %.2f\n",a,b);
        System.out.format("the value of a is %d and value of b is %f\n",a,b);
        Scanner sc = new Scanner(System.in);
        String st=sc.next();
        System.out.println(st);
        Scanner sc1 = new Scanner(System.in);
        String st1=sc1.nextLine();
        System.out.println(st1);
    }
}
