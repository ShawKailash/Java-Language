// write a program to find out whether a given integer is present in an array or not

public class Java_2_Present_Array {
    public static void main(String[] args) {
        float [] marks = {45.6f, 67.8f, 78.9f, 56.7f,97.6f};
        float num=67.8f;
        boolean isinarray=false;
        for(float element:marks)
        {
            if(num==element)
            {
                isinarray=true;
                break;
            }
        }
        if(isinarray)
        {
            System.out.println("the value is present in the array");
        }
        else
        {
            System.out.println("the value is not present in the array");
        }
    }
}
