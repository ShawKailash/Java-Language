import java.util.Random;
import java.util.Scanner;

class game{
    public int number;
    public int inputnumber;
    public int whichattemp=0;
    game(){
        Random random = new Random();
        this.number = random.nextInt(100);
    }
    void takeuserinput(){
        System.out.println("guess the number");
        Scanner sc = new Scanner(System.in);
        inputnumber=sc.nextInt();
    }
    boolean iscorrectnumber(){
        whichattemp++;
        if(inputnumber==number)
        {
            System.out.format("you guess number is %d\n",number);
            System.out.format("you guess in %d attemps\n",whichattemp);
            return true;
        }
        else if(inputnumber>number)
        {
            System.out.println("too high");
        }
        else if(inputnumber<number)
        {
            System.out.println("too low");
        }
        return false;
    }
}
public class Java_50_Exercise_Guess_Number {
    public static void main(String[] args) {
        game g = new game();
        boolean b = false;
        while(!b)
        {
            g.takeuserinput();
            b=g.iscorrectnumber();
        }
    }
}
