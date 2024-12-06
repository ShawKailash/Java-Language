interface bicycle{
    int a=45;
    void applybreake(int decrement);
    void speedup(int increment);
}
interface hornbicycle{
    void blowhorntype();
    void blowhornhum();
}
class avoncycle implements bicycle,hornbicycle{
    void blowhorn(){
        System.out.println("pee pee");
    }
    public void applybreake(int decrement){
        System.out.println("applying breake");
    }
    public void speedup(int increment){
        System.out.println("applying speed");
    }
    public void blowhorntype(){
        System.out.println("kabhi pee pee");
    }
    public void blowhornhum(){
        System.out.println("main poo poo");
    }
}
public class Java_55_Interface{
    public static void main(String[] args) {
        avoncycle kailash = new avoncycle();
        kailash.applybreake(1);
        System.out.println(kailash.a);
        kailash.speedup(2);
        kailash.blowhorn();
        kailash.blowhorntype();
        kailash.blowhornhum();
    }
}
