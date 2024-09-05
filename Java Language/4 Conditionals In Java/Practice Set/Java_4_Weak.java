// write a java program to find out the day of the week
// given the number [1 for monday, 2 for tuesday, 3 for wednesday,
// 4 for thursday, 5 for friday, 6 for saturday, 7 for sunday]

import java.util.Scanner;
public class Java_4_Weak {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int day;
        System.out.println("enter the 1 to 7 is ");
        day=sc.nextInt();
        switch(day)
        {
            case 1 -> System.out.println("Monday");
            case 2 -> System.out.println("tuesday");
            case 3 -> System.out.println("wednesday");
            case 4 -> System.out.println("thursday");
            case 5 -> System.out.println("friday");
            case 6 -> System.out.println("saturday");
            case 7 -> System.out.println("sunday");
        }
    }
}
