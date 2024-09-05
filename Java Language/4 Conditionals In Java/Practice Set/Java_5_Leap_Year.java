// write a java program to find whether a year entered 
// by the user is a leap year nor not leao year

import java.util.Scanner;
public class Java_5_Leap_Year {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int year;
        System.out.println("enter the year is ");
        year=sc.nextInt();
        if(year%4==0)
        {
            System.out.println("it is leap year "+year);
        }
        else
        {
            System.out.println("it is not leap year "+year);
        }
    }
}
