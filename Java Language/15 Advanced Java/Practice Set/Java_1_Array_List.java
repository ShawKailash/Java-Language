// Create an arraylist and store name of 10 students inside it print it using a for each loop

import java.util.ArrayList;

public class Java_1_Array_List {
    public static void main(String[] args) {
        ArrayList ar = new ArrayList<>();
        ar.add("student 1");
        ar.add("student 2");
        ar.add("student 3");
        ar.add("student 4");
        ar.add("student 5");
        ar.add("student 6");
        ar.add("student 7");
        ar.add("student 8");
        ar.add("student 9");
        ar.add("student 10");
        for(Object o : ar)
        {
            System.out.println(o);
        }
    }
}
