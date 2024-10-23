// create a set in java try to store duplicate element inside
// this set and verify that only one instance in stored

import java.util.HashSet;

public class Java_5_Hash_Set {
    public static void main(String[] args) {
        HashSet<Integer> s = new HashSet<>();
        s.add(4);
        s.add(6);
        s.add(9);
        s.add(4);
        s.add(2);
        s.add(7);
        s.add(5);
        System.out.println(s);
    }
}
