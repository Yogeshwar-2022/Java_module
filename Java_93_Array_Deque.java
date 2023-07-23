import java.util.*;

public class Java_93_Array_Deque {
    public static void main(String[] args) {
        ArrayDeque<Integer> ad1 = new ArrayDeque<>();
        ad1.add(10);
        ad1.add(20);
        ad1.add(30);
        ad1.add(40);
        ad1.add(50);
        ad1.removeFirst();
        ad1.addFirst(0);
        ad1.removeLast();
        ad1.addLast(60);
        System.out.println(ad1.getFirst());
        System.out.println(ad1.getLast());
        System.out.println(ad1);
    }
}
