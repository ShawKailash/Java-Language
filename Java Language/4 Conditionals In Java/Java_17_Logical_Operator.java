public class Java_17_Logical_Operator {
    public static void main(String[] args) {
        System.out.println("logical AND....");
        boolean a = true;
        boolean b = false;
        if(a && b)
        {
            System.out.println("y");
        }
        else
        {
            System.out.println("n");
        }
        System.out.println("logical OR...");
        if(a || b)
        {
            System.out.println("y");
        }
        else
        {
            System.out.println("n");
        }
        System.out.println("logical NOT..");
        System.out.print("Not(a) is ");
        System.out.println(!a);
        System.out.print("Not(b) is ");
        System.out.println(!b);
    }
}
