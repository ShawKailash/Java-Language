public class Java_32_Overloading_Java {
    static void telljoke(){
        System.out.println("i invented a new word\n"+"plagiarism");
    }
    static void change(int a){
        a=98;
    }
    static void change2(int [] arr){
        arr[0] = 23;
    }
    static void foo(){
        System.out.println("good morning bro");
    }
    static void foo(int a){
        System.out.println("good morning "+a+" bro");
    }
    static void foo(int a, int b){
        System.out.println("good morning "+a+" bro");
        System.out.println("love you "+b+" jaanu");
    }
    public static void main(String[] args) {
        telljoke();
        int x =45;
        change(x);
        System.out.println("the value of x after running change is "+x);
        int [] marks = {34, 56, 67, 89, 97};
        change2(marks);
        System.out.println("the value of marks after running change2 is "+marks[0]);
        foo();
        foo(20);
        foo(20,50);
    }
}
