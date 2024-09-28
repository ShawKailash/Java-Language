class overloading{
    private int id;
    private String name;
    public overloading(){
        id=22;
        name="kailash";
    }
    public overloading(String myname, int myid){
        id=myid;
        name=myname;
    }
    public overloading(String myname){
        id=23;
        name=myname;
    }
    public overloading(int myid){
        id=myid;
        name="komal";
    }
    public void setid(int i){
        id=i;
    }
    public int getid(){
        return id;
    }
    public void setname(String n){
        name=n;
    }
    public String getname(){
        return name;
    }
}
public class Java_42_Constructor_Overloading {
    public static void main(String[] args) {
        overloading m1 = new overloading();
        System.out.println(m1.getid());
        System.out.println(m1.getname());

        overloading m2 = new overloading("karan",12);
        System.out.println(m2.getid());
        System.out.println(m2.getname());

        overloading m3 = new overloading("arun");
        System.out.println(m3.getid());
        System.out.println(m3.getname());

        overloading m4 = new overloading(25);
        System.out.println(m4.getid());
        System.out.println(m4.getname());
        
        overloading m5 = new overloading();
        m5.setid(26);
        System.out.println(m5.getid());
        m5.setname("pooja");
        System.out.println(m5.getname());
    }
}
