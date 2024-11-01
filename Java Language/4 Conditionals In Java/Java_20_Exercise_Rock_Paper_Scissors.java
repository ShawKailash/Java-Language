import java.util.Random;
import java.util.Scanner;

public class Java_20_Exercise_Rock_Paper_Scissors {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter 0 for rock, 1 for paper, 2 for scissor");
        int userinput = sc.nextInt(3);
        if(userinput==0)
        {
            System.out.println("rock");
        }
        else if(userinput==1)
        {
            System.out.println("paper");
        }
        else
        {
            System.out.println("scissor");
        }
        Random random = new Random();
        int computerinput = random.nextInt(3);

        if(userinput==computerinput)
        {
            System.out.println("drow");
        }
        else if(userinput==0 && computerinput==2 || userinput==1 && computerinput==0 || userinput==2 && computerinput==1)
        {
            System.out.println("you win");
        }
        else
        {
            System.out.println("computer win");
        }
        if(computerinput==0)
        {
            System.out.println("computer choise "+computerinput+" rock");
        }
        else if(computerinput==1)
        {
            System.out.println("computer choise "+computerinput+" paper");
        }
        else
        {
            System.out.println("computer choise "+computerinput+" scissor");
        }
    }
}
