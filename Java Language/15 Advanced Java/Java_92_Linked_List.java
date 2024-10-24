import java.util.LinkedList;

public class Java_92_Linked_List {
    public static void main(String[] args) {
        LinkedList<Integer> l1 = new LinkedList<>();
        LinkedList<Integer> l2 = new LinkedList<>();
        l2.add(345);
        l2.add(567);
        l2.add(787);
        l1.add(4);
        l1.add(5);
        l1.add(7);
        l1.add(9);
        l1.add(5);
        l1.add(4);
        l1.add(9);
        l1.add(8);
        l1.add(0,99);
        l1.add(0,55);
        l1.addAll(0,l2);
        l1.addLast(6754);
        l1.addFirst(7865);
        System.out.println(l1.contains(567));
        System.out.println(l1.contains(456));
        System.out.println(l1.indexOf(4));
        System.out.println(l1.lastIndexOf(4));
        l1.set(8,5783);
        for(int i=0;i<l1.size();i++)
        {
            System.out.print(l1.get(i));
            System.out.print(", ");
        }
    }
}
