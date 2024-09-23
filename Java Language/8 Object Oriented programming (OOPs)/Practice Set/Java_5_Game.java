// create a class tommy for rockstar games capable of hitting, running, firing etc

class game{
    public void run(){
        System.out.println("running from the enemy");
    }
    public void fire(){
        System.out.println("firing on the enemy");
    }
    public void hit(){
        System.out.println("hitting the enemy");
    }
}
public class Java_5_Game {
    public static void main(String[] args) {
        game player = new game();
        player.run();
        player.fire();
        player.hit();
    }
}
