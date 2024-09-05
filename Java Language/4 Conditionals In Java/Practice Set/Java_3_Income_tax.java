// calculate income tax paid by an employee to the
// government as per the slabs mentioned bellow

// income slabs                    tax
// 2.5l to 5.0l                    5%
// 5.0l to 10.0l                   20%
// above 10.0l                     30%
// note that there is no tax bellow 2.5l
// take inputamount as an input from the user

import java.util.Scanner;
public class Java_3_Income_tax {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float tax=0;
        float income;
        System.out.println("enter your income is ");
        income = sc.nextFloat();
        if(income<=2.5f)
        {
            tax=tax+0;
        }
        else if(income>2.5f && income<=5.0f)
        {
            tax=tax+0.05f*(income-2.5f);
        }
        else if(income>5.0f && income<=10.0f)
        {
            tax=tax+0.2f*(income-5.0f);
        }
        else if(income>10.0f)
        {
            tax=tax+0.3f*(income-10.0f);
        }
        System.out.println("the total tax paid by the employee is "+tax);
    }
}
