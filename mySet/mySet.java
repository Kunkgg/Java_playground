import java.util.Set;
import java.util.HashSet;


/**
 * mySet
 */
public class mySet {

    public static void main(String[] args) {
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();

        set1.add(1);
        set1.add(2);
        set1.add(3);
        set1.add(4);

        set2.add(3);
        set2.add(4);
        set2.add(5);
        set2.add(6);
        set2.add(6);

        System.out.println("Set 1:" + set1);
        System.out.println("Set 2:" + set2);
        System.out.println("Union: " + set1.addAll(set2));
        System.out.println("After union, Set 1:" + set1);
        System.out.println("Intersection: " + set1.retainAll(set2));
        System.out.println("After intersection, Set 1:" + set1);
        System.out.println("Subset: " + set1.containsAll(set2));
    }
}
