import java.util.*;

public class Java_92_LinkedList_Demo_And_Methods {
    public static void main(String[] args) {
        LinkedList<Integer> ll1 = new LinkedList<>();
        ll1.add(0,10);
        ll1.addFirst(0);
        ll1.add(20);
        ll1.add(30);
        ll1.add(40);
        ll1.add(50);
        ll1.add(60);
        ll1.addLast(70);
        System.out.println(ll1);
        Object [] l1 = ll1.toArray(); //Converts all elements of linked list to sequential array
    }
}
