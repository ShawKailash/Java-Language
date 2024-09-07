import java.util.Scanner;
public class Java_18_2_Switch_Case {
    public static void main(String[] args) {
        int age;
        System.out.println("enter the number 18,30,60");
        Scanner sc = new Scanner(System.in);
        age = sc.nextInt();
        switch(age)
        {
            case 18:
            System.out.println("you are adult");
            break;
            case 30:
            System.out.println("you are going tojoin a job");
            break;
            case 60:
            System.out.println("you are going to get retired");
            break;
            default:
            System.out.println("you are wrong input");
        }
        System.out.println("thanks for using my java code");
        
    }
}
