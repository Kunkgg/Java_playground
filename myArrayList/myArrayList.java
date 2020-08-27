import java.util.List;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Iterator;
import java.util.Collections;

/**
 * myArrayList
 */
public class myArrayList {

    public static void main(String[] args) {
        ArrayList<String> animals = new ArrayList<>();

        animals.add("cat");
        animals.add("dog");
        animals.add("horse");

        System.out.println("ArrayList: " + animals);

        System.out.println("=======================");

        ArrayList<Integer> numbers = new ArrayList<Integer>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);

        System.out.println("numbers: " + numbers);
        System.out.println("numbers[3]: " + numbers.get(3));
        System.out.println("removed: " + numbers.remove(4));
        System.out.println("numbers after removed: " + numbers);
        System.out.println("numbers set: " + numbers.set(0, 10));
        System.out.println("numbers after set: " + numbers);
        System.out.println("index of 2: " + numbers.indexOf(2));
        System.out.println("index of 20: " + numbers.indexOf(20));
        System.out.println("size of numbers: " + numbers.size());

        System.out.println("print numbers by iterator: ");
        Iterator<Integer> iter = numbers.iterator();
        while (iter.hasNext()) {
            System.out.print(iter.next());
            System.out.print(", ");
        }
        System.out.println("");
        Collections.sort(numbers);
        System.out.println("sorted numbers: " + numbers);

        System.out.println("print numbers ArrayList to Array: ");
        Integer[] numbersArr = new Integer[numbers.size()];
        numbers.toArray(numbersArr);
        for (int e : numbersArr) {
            System.out.print(e + ", ");
        }
        System.out.println();


        System.out.println("=======================");

        LinkedList<String> chars = new LinkedList<String>();
        chars.add("A");
        chars.add("B");
        chars.add("C");
        chars.add("D");
        chars.add("E");

        System.out.println("LinkedList: " + chars);

        System.out.println("index of C: " + chars.indexOf("C"));
        System.out.println("get index 3: " + chars.get(3));
        System.out.println("removed: " + chars.remove(2));
        System.out.println("chars after removed: " + chars);
        System.out.println("pop: " + chars.pop());
        System.out.println("chars after pop: " + chars);
        System.out.println("first: " + chars.getFirst());
        System.out.println("size of chars: " + chars.size());

    }
}
