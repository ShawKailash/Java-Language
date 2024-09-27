class myemployee{
    private int id;
    private String name;
    public void setname(String n){
        this.name=n;
    }
    public String getname(){
        return name;
    }
    public void setid(int i){
        this.id=i;
    }
    public int getid(){
        return id;
    }
}
public class Java_40_Set_Get {
    public static void main(String[] args) {
        myemployee detail = new myemployee();
        detail.setname("kailash");
        System.out.println(detail.getname());
        detail.setid(24);
        System.out.println(detail.getid());
    }
}
