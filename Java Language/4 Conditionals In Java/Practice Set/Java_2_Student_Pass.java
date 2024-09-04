// write a java program to find out whether a student is pass or fail.
// if it requires total 40% and at least 33% in each subject to pass.
// assume 3 subject and take marks as an input from the user

import java.util.Scanner;
public class Java_2_Student_Pass {
    public static void main(String[] args) {
        int physics,chemistry,math;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter your marks in physics ");
        physics = sc.nextInt();
        System.out.println("enter your marks in chemistry ");
        chemistry = sc.nextInt();
        System.out.println("enter your marks in math ");
        math = sc.nextInt();
        float avg = (physics+chemistry+math)/3.0f;
        System.out.println("your overall percentage is "+avg);
        if(avg>=40 && physics>=33 && chemistry>=33 && math>=33)
        {
            System.out.println("you are promted");
        }
        else
        {
            System.out.println("you are fail");
        }
    }
}
