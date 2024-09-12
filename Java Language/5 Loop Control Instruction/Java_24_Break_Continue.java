public class Java_24_Break_Continue {
    public static void main(String[] args) {
        System.out.println("it is break");
        for(int i=0;i<=10;i++)
        {
            System.out.println(i);
            if(i==4)
            {
                System.out.println("ending the loop");
                break;
            }
        }
        System.out.println("\n");
        System.out.println("it is continue");
        for(int a=0;a<=10;a++)
        {
            System.out.println(a);
            if(a==4)
            {
                System.out.println("continue the loop");
                continue;
            }
        }
    }
}
