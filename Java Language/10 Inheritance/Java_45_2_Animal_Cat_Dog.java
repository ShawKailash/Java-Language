// create a class animal and derive another class dog from it

class animal{
    String cat;
    public String getcat(){
        return cat;
    }
    public void setcat(String cat){
        System.out.print("i am cat ");
        this.cat=cat;
    }
}
class dog extends animal{
    String dog;
    public String getdog(){
        return dog;
    }
    public void setdog(String dog){
        System.out.print("i am dog ");
        this.dog=dog;
    }
}
public class Java_45_2_Animal_Cat_Dog {
    public static void main(String[] args) {
        dog d = new dog();
        d.setcat("snow bell");
        System.out.println(d.getcat());
        d.setdog("bruno");
        System.out.println(d.getdog());
    }
}
