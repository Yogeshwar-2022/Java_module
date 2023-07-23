import java.util.*;

public class Java_95_HashSet {
    public static void main(String[] args) {
        HashSet<Integer> hs = new HashSet<>(8);
        hs.add(36);
        hs.add(18);
        hs.add(72);
        hs.add(43);
        hs.add(6);
        for (int i:hs) {
            System.out.println(i);
        }
    }
}
