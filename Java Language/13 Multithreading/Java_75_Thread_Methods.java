class threadmethod1 extends Thread{
    public void run(){
        while(true){
            System.out.println("thread method");
            try{
                Thread.sleep(4);
            }
            catch (InterruptedException e){
                e.printStackTrace();
            }
        }
    }
}
class threadmethod2 extends Thread{
    public void run(){
        while(true){
            System.out.println("thank you");
        }
    }
}
public class Java_75_Thread_Methods {
    public static void main(String[] args) {
        threadmethod1 t1 = new threadmethod1();
        threadmethod2 t2 = new threadmethod2();
        t1.start();
        // try{
        //     t1.join();
        // }
        // catch(Exception e){
        //     System.out.println(e);
        // }
        t2.start();
    }
}
