class mythread extends Thread{
    public mythread(String name){
        super(name);
    }
    public void run(){
        int i=34;
        System.out.println("i am a thread");
    }
}
public class Java_73_Constructor_Thread {
    public static void main(String[] args) {
        mythread t1 = new mythread("kailash");
        mythread t2 = new mythread("karan");
        t1.start();
        t2.start();
        System.out.println("the id of the thread t1 is "+ t1.getId());
        System.out.println("the id of the thread t1 is "+ t1.getName());
        System.out.println("the id of the thread t2 is "+ t2.getId());
        System.out.println("the id of the thread t2 is "+ t2.getName());
    }
}
