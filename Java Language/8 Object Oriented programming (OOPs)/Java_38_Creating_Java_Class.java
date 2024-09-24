class employee{
    int id;
    int salary;
    String name;
    public void printdetails(){
        System.out.println("my id is "+ id);
        System.out.println("and my name is "+ name);
    }
    public int getsalary(){
        return salary;
    }
}
public class Java_38_Creating_Java_Class {
    public static void main(String[] args) {
        System.out.println("this is our custom class");
        employee sk = new employee();
        employee sks = new employee();
        sk.id=12;
        sk.salary=12000;
        sk.name="kailash";
        sks.id=23;
        sks.salary=23000;
        sks.name="karan";

        System.out.println(sk.id);
        System.out.println(sk.name);

        sk.printdetails();
        int salary=sk.getsalary();
        System.out.println(salary);
        
        sks.printdetails();
        int salary1=sks.getsalary();
        System.out.println(salary1);
    }
}