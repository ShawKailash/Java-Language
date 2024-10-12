// write a program to print good morning and welcome  continuously
// on the screen in java using thread

class goodmorning extends Thread{
    public void run(){
        while(true){
            System.out.println("good Moring");
        }
    }
}
class welcome extends Thread{
    public void run(){
        while(true){
            System.out.println("welcome");
        }
    }
}
public class Java_1_Thread {
    public static void main(String[] args) {
        goodmorning gm = new goodmorning();
        welcome w = new welcome();
        gm.start();
        w.start();
    }
}
