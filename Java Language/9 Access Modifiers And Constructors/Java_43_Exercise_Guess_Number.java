import java.util.Random;
import java.util.Scanner;

public class Java_43_Exercise_Guess_Number {
    public static void main(String[] args) {
        Random random = new Random();
        int computerinput = random.nextInt(100);
        System.out.println("enter the guess number 1 to 100");
        for(int i=1;i<=10;i++)
        {
            Scanner sc = new Scanner(System.in);
            int userinput = sc.nextInt();
            if(userinput > computerinput)
            {
                System.out.println("minimum number input");
            }
            else if(userinput < computerinput)
            {
                System.out.println("maximum number input");
            }
            else
            {
                System.out.println("guess number");
                break;
            }
        }
        System.out.println("computer choise number is "+computerinput);
    }
    
}
