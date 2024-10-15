class mythreadrunnable1 implements Runnable{
    public void run(){
        int i=0;
        while(i<400){
            System.out.println("i am thread 1 not a threat 1");
            i++;
        }
    }
}
class mythreadrunnable2 implements Runnable{
    public void run(){
        int i=0;
        while(i<400){
            System.out.println("i am thread 2 not a threat 2");
            i++;
        }
    }
}
public class Java_71_Creating_Thread_Runnable_Interface {
    public static void main(String[] args) {
        mythreadrunnable1 bullet1 = new mythreadrunnable1();
        Thread gun1 = new Thread(bullet1);
        mythreadrunnable2 bullet2 = new mythreadrunnable2();
        Thread gun2 = new Thread(bullet2);
        gun1.start();
        gun2.start();
    }
}
