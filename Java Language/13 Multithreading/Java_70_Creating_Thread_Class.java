class mythread1 extends Thread{
    @Override
    public void run(){
        int i=0;
        while(i<400){
            System.out.println("my theard is running");
            System.out.println("i am happy");
            i++;
        }
    }
}
class mythread2 extends Thread{
    @Override
    public void run(){
        int i=0;
        while(i<400){
            System.out.println("theard 2 is good");
            System.out.println("i am sad");
            i++;
        }
    }
}
public class Java_70_Creating_Thread_Class {
    public static void main(String[] args) {
        mythread1 t1 = new mythread1();
        mythread2 t2 = new mythread2();
        t1.start();
        t2.start();
    }
}
