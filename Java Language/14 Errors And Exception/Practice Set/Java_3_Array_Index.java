// write a java program that allows you to keep accessing an array
// until a valid index is given if max retries exceed 5 print error

import java.util.Scanner;

public class Java_3_Array_Index {
    public static void main(String[] args) {
        boolean flag=true;
        int [] marks = new int[3];
        marks[0]=7;
        marks[1]=46;
        marks[2]=9;
        Scanner sc = new Scanner(System.in);
        int index;
        int i=0;
        while(flag && i<5)
        {
            try{
                System.out.println("enterv the index number");
                index = sc.nextInt();
                System.out.println("the value os marks[index] is "+marks[index]);
                break;
            }
            catch (Exception e){
                System.out.println("invalid index");
                i++;
            }
        }
        if(i>=5){
            System.out.println("error");
        }
    }
}
