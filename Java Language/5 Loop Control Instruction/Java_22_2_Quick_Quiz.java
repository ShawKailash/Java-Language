// quick quiz
// write a java program to print first n natural numbers using do while loop

import java.util.Scanner;
public class Java_22_2_Quick_Quiz {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("enter the n number is");
        n=sc.nextInt();
        do
        {
            System.out.println(n);
            n++;
        }
        while(n<=10);
    }
}
