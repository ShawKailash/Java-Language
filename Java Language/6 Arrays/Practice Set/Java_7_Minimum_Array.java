// write a java program to find the minimum element in an java array

public class Java_7_Minimum_Array {
    public static void main(String[] args) {
        int [] arr = {34,56,-6,-78,56,8,-45,-95,95,83};
        int min=0;
        for(int element:arr)
        {
            if(element<min)
            {
                min=element;
            }
        }
        System.out.println("the maximum value is "+min);
    }
}
