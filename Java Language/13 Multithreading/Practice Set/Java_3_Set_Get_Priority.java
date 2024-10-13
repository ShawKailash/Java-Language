// demonstrate getpriority() and setpriority() methods in java thread

class priority1 extends Thread{
    public void run(){
        System.out.println("good morning");
    }
}
class priority2 extends Thread{
    public void run(){
        System.out.println("good morning");
    }
}
public class Java_3_Set_Get_Priority {
    public static void main(String[] args) {
        priority1 p1 = new priority1();
        priority2 p2 = new priority2();
        System.out.println(p1.getPriority());
        System.out.println(p2.getPriority());
        System.out.println(p1.getState());
    }
}
