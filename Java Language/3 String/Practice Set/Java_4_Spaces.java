// write a java program to detect double and triple spaces in a string

public class Java_4_Spaces {
    public static void main(String[] args) {
        String mystring = "this string contains double  and triple   spaces";
        System.out.println(mystring.indexOf("  "));
        System.out.println(mystring.indexOf("   "));
    }
}
