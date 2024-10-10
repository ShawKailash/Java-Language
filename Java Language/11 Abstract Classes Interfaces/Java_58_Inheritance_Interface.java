interface simpleinterface{
    void meth1();
    void meth2();
}
interface childsimpleinterface extends simpleinterface{
    void meth3();
    void meth4();
}
class mysampleclass implements childsimpleinterface{
    public void meth1(){
        System.out.println("meth1");
    }
    public void meth2(){
        System.out.println("meth2");
    }
    public void meth3(){
        System.out.println("meth3");
    }
    public void meth4(){
        System.out.println("meth4");
    }
}
public class Java_58_Inheritance_Interface {
    public static void main(String[] args) {
        mysampleclass msc = new mysampleclass();
        msc.meth1();
        msc.meth2();
        msc.meth3();
        msc.meth4();
    }
}
