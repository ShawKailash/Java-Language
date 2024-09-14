// write a java program to find whether an array is sorted or not

public class Java_8_Sorted_Array {
    public static void main(String[] args) {
        int [] arr = {1,4,6,8,9,23,34,45,56,67,78};
        boolean issorted=true;
        for(int i=0;i<arr.length-1;i++)
        {
            if(arr[i]>arr[i+1])
            {
                issorted=false;
                break;
            }
        }
        if(issorted)
        {
            System.out.println("the array is sorted");
        }
        else
        {
            System.out.println("the array is not sorted");
        }
    }
}
