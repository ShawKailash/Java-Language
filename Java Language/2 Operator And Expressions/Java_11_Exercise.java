import java.util.Scanner;
public class Java_11_Exercise {
    public static void main(String[] args) {
        System.out.println("all subject detail ");
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the mark of computer is ");
        int computer = sc.nextInt();
        System.out.println("enter the mark of math is ");
        int math = sc.nextInt();
        System.out.println("enter the mark of english is ");
        int english = sc.nextInt();
        System.out.println("enter the mark of physics is ");
        int physics = sc.nextInt();
        System.out.println("enter the mark of chemistry is ");
        int chemistry = sc.nextInt();
        int totalmarks = computer+math+english+physics+chemistry;
        System.out.println("the total marks is ");
        System.out.println(totalmarks);
        float totalpercentage = (computer+math+english+physics+chemistry)/5.0f;
        System.out.println("the precantage is ");
        System.out.println(totalpercentage+" %");

    }
    
}
