// quick quiz
// write a java program to print the element of an array in reverse order

public class Java_27_2_Quick_Quiz {
    public static void main(String[] args) {
        int [] marks = {45,56,67,89,97,43,64,87,73};
        for(int i=marks.length-1;i>=0;i--)
        {
            System.out.println(marks[i]);
        }
    }
}
