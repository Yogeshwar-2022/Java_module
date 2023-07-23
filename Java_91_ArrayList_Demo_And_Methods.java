import java.util.*;

public class Java_91_ArrayList_Demo_And_Methods {
    public static void main(String[] args) {
        ArrayList<Integer> l1 = new ArrayList<>();
        ArrayList<Integer> l2 = new ArrayList<>(3);
        l1.add(20); //appends element
        l1.add(30);
        l1.add(40);
        l1.add(0,10); //adds element at index 0, pushes all other elements to next index
        l2.add(40);
        l2.add(50);
        l2.add(60);
        l1.addAll(l2); //appends elements of l2 to l1
        l1.set(6,100); //replaces element at index 6 with 100
        l1.removeIf(n->(n%3==0)); //removes all elements from l1 if that element is divisible by 3
        System.out.println("Size of ArrayList : "+l1.size());
        System.out.println("1st element in ArrayList : "+l1.get(0));
        System.out.println(l1.contains(40)); //returns boolean value depending on if element if present in ArrayList
        System.out.println(l1.indexOf(40)); //returns first occurrence index of given element , -1 if not present
        System.out.println(l1.lastIndexOf(40)); //returns last occurrence index of given element , -1 if not present
        // l1.addAll(0,l2); //adds elements of l2 from 0th index
        // l1.clear();
        System.out.println(l1);
    }
}
