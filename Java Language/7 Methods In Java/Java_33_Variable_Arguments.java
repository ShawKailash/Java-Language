public class Java_33_Variable_Arguments {
    static int sum(int x, int ...arr){
        int result=x;
        for(int a: arr)
        {
            result+=a;
        }
        return result;
    }
    public static void main(String[] args) {
        System.out.println("variable argument");
        System.out.println("the sum of 1 is "+sum(1));
        System.out.println("the sum of 1 and 2 is "+sum(1,2));
        System.out.println("the sum of 1,2 and 3 is "+sum(1,2,3));
        System.out.println("the sum of 1,2,3 and 4 is "+sum(1,2,3,4));
        System.out.println("the sum of 1,2,3,4 and 5 is "+sum(1,2,3,4,5));
    }
}
