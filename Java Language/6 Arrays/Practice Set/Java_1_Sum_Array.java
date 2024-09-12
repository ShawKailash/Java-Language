// create an array of 5 float and calculate their sum

public class Java_1_Sum_Array {
    public static void main(String[] args) {
        float [] marks = {45.6f, 67.8f, 78.9f, 56.7f,97.6f};
        float sum=0;
        for(float element:marks)
        {
            sum=sum+element;
        }
        System.out.println("the value of sum is "+sum);
    }
}