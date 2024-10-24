import java.util.ArrayDeque;

public class Java_93_Array_Deque {
    public static void main(String[] args) {
        ArrayDeque<Integer> ad1 = new ArrayDeque<>();
        ad1.add(6);
        ad1.add(94);
        ad1.add(8);
        ad1.addFirst(456);
        ad1.addLast(675);
        System.out.println(ad1.getFirst());
        System.out.println(ad1.getLast());
    }
}
