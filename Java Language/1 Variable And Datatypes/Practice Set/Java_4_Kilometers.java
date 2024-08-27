// write a java program to convert kilometers to miles

import java.util.Scanner;
public class Java_4_Kilometers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the kilometer is ");
        int kilometer=sc.nextInt();  
        float miles = kilometer*0.621371f;
        System.out.println("kilometer to convert miles is "+miles);
    }
}
