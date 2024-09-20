public class Java_31_2_Calling_Method_Java {
    int logic(int x, int y)
    {
        int z;
        if(x>y)
        {
            z=x+y;
        }
        else
        {
            z=(x+y)*5;
        }
        return z;
    }
    public static void main(String[] args) {
        int a=5;
        int b=7;
        int c;
        Java_31_2_Calling_Method_Java obj = new Java_31_2_Calling_Method_Java();
        c=obj.logic(a,b);
        int a1=4;
        int b1=2;
        int c1;
        c1=obj.logic(a1,b1);
        System.out.println(c);
        System.out.println(c1);
    }
}
