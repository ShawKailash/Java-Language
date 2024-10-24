import java.util.ArrayList;

public class Java_91_Array_List {
    public static void main(String[] args) {
        ArrayList<Integer> l1 = new ArrayList<>();
        ArrayList<Integer> l2 = new ArrayList<>(5);
        l2.add(14);
        l2.add(18);
        l2.add(16);
        l1.add(4);
        l1.add(6);
        l1.add(8);
        l1.add(4);
        l1.add(3);
        l1.add(6);
        l1.add(0,5);
        l1.add(0,6);
        l1.addAll(0,l2);
        System.out.println(l1.contains(4));
        System.out.println(l1.contains(7));
        System.out.println(l1.indexOf(6));
        System.out.println(l1.lastIndexOf(6));
        l1.set(1,23);
        // l1.clear();
        for(int i=0;i<l1.size();i++)
        {
            System.out.print(l1.get(i));
            System.out.print(", ");
        }
    }
}
