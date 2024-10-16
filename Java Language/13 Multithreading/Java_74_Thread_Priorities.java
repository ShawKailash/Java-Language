class mythreadpriorities extends Thread{
    public mythreadpriorities(String name){
        super(name);
    }
    public void run(){
        while(true){
            System.out.println("i am a thread "+this.getName());
        }
    }
}
public class Java_74_Thread_Priorities {
    public static void main(String[] args) {
        mythreadpriorities t1 = new mythreadpriorities("kailash1");
        mythreadpriorities t2 = new mythreadpriorities("kailash2");
        mythreadpriorities t3 = new mythreadpriorities("kailash3");
        mythreadpriorities t4 = new mythreadpriorities("kailash4");
        mythreadpriorities t5 = new mythreadpriorities("kailash5 (most important)");
        t1.setPriority(Thread.MIN_PRIORITY);
        t2.setPriority(Thread.MIN_PRIORITY);
        t3.setPriority(Thread.MIN_PRIORITY);
        t4.setPriority(Thread.MIN_PRIORITY);
        t5.setPriority(Thread.MAX_PRIORITY);
        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
    }
}
