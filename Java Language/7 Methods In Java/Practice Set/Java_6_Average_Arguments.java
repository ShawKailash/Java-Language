// write a function to find average of a set of numbers passed as arguments 

public class Java_6_Average_Arguments {
    static int averagesum(int ...arr){
        int result=0;
        for(int a: arr)
        {
            result+=a;
        }
        return result/arr.length;
    }
    public static void main(String[] args) {
        int a=averagesum(5,6,3,7,8,45,67,78,24,3);
        System.out.println("the average is "+a);
    }
}
