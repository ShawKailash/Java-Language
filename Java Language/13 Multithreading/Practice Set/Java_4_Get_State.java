// how do you get state of a given thread in java

class state1 extends Thread{
    public void run(){
        
    }
}
class state2 extends Thread{
    public void run(){

    }
}
public class Java_4_Get_State {
    public static void main(String[] args) {
        state1 s1 = new state1();
        state2 s2 = new state2();
        System.out.println(s1.getState());
        System.out.println(s2.getState());
        s1.start();
        s2.start();
        System.out.println(s1.getState());
        System.out.println(s2.getState());
    }
}
