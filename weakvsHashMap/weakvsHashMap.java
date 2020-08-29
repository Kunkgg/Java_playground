import java.util.HashMap;
import java.util.WeakHashMap;

/**
 * weakvsHashMap
 */
public class weakvsHashMap {

    public static void main(String[] args) {
        System.out.println("=== WeakHashMap ===");
        WeakHashMap<String, Integer> weakHashNumbers = new WeakHashMap<>();

        String one = new String("one");
        Integer oneValue = 1;
        String two = new String("two");
        Integer twoValue = 2;

        weakHashNumbers.put(one, oneValue);
        weakHashNumbers.put(two, twoValue);

        System.out.println("weakHashNumbers: " + weakHashNumbers);

        two = null;

        System.gc();
        System.out.println("After gc, weakHashNumbers: " + weakHashNumbers);


        System.out.println("=== HashMap ===");
        HashMap<String, Integer> hashNumbers = new HashMap<>();

        String three = new String("three");
        Integer threeValue = 3;
        String four = new String("four");
        Integer fourValue = 4;

        hashNumbers.put(three, threeValue);
        hashNumbers.put(four, fourValue);

        System.out.println("hashNumbers: " + hashNumbers);

        four = null;

        System.gc();
        System.out.println("After gc, hashNumbers: " + hashNumbers);
    }
}
