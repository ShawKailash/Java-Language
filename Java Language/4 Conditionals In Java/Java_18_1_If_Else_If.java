import java.util.Scanner;
public class Java_18_1_If_Else_If {
    public static void main(String[] args) {
        int age;
        System.out.println("enter tour age is ");
        Scanner sc = new Scanner(System.in);
        age = sc.nextInt();
        if(age>60)
        {
            System.out.println("you are experienced");
        }
        else if(age>50)
        {
            System.out.println("you are semi experienced");
        }
        else if(age>40)
        {
            System.out.println("you are semi semi experienced");
        }
        else
        {
            System.out.println("you are not experienced");
        }
    }
}
