// write a java program to find the maximum element in an array

public class Java_6_Maximum_Array {
    public static void main(String[] args) {
        int [] arr = {56,78,67,90,34,46,11,83,99,23,44,55,66,77,22};
        int max=0;
        for(int element:arr)
        {
            if(element>max)
            {
                max=element;
            }
        }
        System.out.println("the maximum value is "+max);
    }
}
