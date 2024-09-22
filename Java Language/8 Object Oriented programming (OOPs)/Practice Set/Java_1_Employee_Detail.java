// create a class employee with following properties and methods
// salary (property)(int)
// getsalary (method returning int)
// name (property)(string)
// getname (method returning string)
// setname (method changing name)

class employee{
    int salary;
    String name;
    public int getsalary(){
        return salary;
    }
    public String getname(){
        return name;
    }
    public void setname(String n){
        name=n;
    }
}
public class Java_1_Employee_Detail {
    public static void main(String[] args) {
        employee sk = new employee();
        sk.setname("kailash");
        sk.salary=30000;
        System.out.println(sk.getname());
        System.out.println(sk.getsalary());
    }
}
