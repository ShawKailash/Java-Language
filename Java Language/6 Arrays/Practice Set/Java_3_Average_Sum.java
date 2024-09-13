// calculate the average marks from an array containing
// marks of all student in physics using for each loop

public class Java_3_Average_Sum {
    public static void main(String[] args) {
        float [] marks = {45,67,89,87,64};
        float sum=0;
        for(float element:marks)
        {
            sum=sum+element;
        }
        System.out.println("the value of average marks is "+sum/marks.length);
    }
}
