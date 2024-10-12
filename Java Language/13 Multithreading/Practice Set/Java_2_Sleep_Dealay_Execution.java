// add a sleep method in welcome thread of question to dealay its execution for 200ms

class sleepdealay1 extends Thread{
    public void run(){
        while(true){
            try{
                Thread.sleep(200);
            }
            catch (Exception e){
                System.out.println(e);
            }
            System.out.println("good morning");
        }
    }
}
class sleepdealay2 extends Thread{
    public void run(){
        while(true){
            try{
                Thread.sleep(200);
            }
            catch (Exception e){
                System.out.println(e);
            }
            System.out.println("welcome");
        }
    }
}
public class Java_2_Sleep_Dealay_Execution {
    public static void main(String[] args) {
        sleepdealay1 s1 = new sleepdealay1();
        sleepdealay2 s2 = new sleepdealay2();
        s1.start();
        s2.start();
    }
}
