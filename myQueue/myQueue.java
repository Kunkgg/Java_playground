import java.util.PriorityQueue;
import java.util.Iterator;
import java.util.Comparator;

/**
 * myQueue
 */
public class myQueue {

    public static void main(String[] args) {
        PriorityQueue<Integer> numbers = new PriorityQueue<>();

        numbers.add(3);
        numbers.add(4);
        numbers.add(2);
        System.out.println("PriorityQueue: " + numbers);

        numbers.offer(1);
        numbers.offer(0);
        System.out.println("Updated PriorityQueue: " + numbers);

        System.out.println("peek: " + numbers.peek());
        System.out.println("Updated PriorityQueue: " + numbers);
        System.out.println("remove 2 :" + numbers.remove(2));
        System.out.println("Updated PriorityQueue: " + numbers);
        System.out.println("poll :" + numbers.poll());
        System.out.println("Updated PriorityQueue: " + numbers);
        System.out.println("poll :" + numbers.poll());
        System.out.println("Updated PriorityQueue: " + numbers);
        System.out.println("poll :" + numbers.poll());
        System.out.println("Updated PriorityQueue: " + numbers);
        System.out.println("poll :" + numbers.poll());
        System.out.println("Updated PriorityQueue: " + numbers);

        // Creating a priority queue
        PriorityQueue<Integer> numbers2 = new PriorityQueue<>();
        numbers2.add(4);
        numbers2.add(2);
        numbers2.add(1);
        numbers2.add(3);
        System.out.println("================================");
        System.out.println("PriorityQueue using iterator(): ");

        // Using the iterator() method
        Iterator<Integer> iterate = numbers2.iterator();
        while (iterate.hasNext()) {
            System.out.print(iterate.next());
            System.out.print(", ");
        }
        System.out.println();

        System.out.println("poll :" + numbers2.poll());
        System.out.println("Updated PriorityQueue: " + numbers2);
        System.out.println("poll :" + numbers2.poll());
        System.out.println("Updated PriorityQueue: " + numbers2);
        System.out.println("poll :" + numbers2.poll());
        System.out.println("Updated PriorityQueue: " + numbers2);
        System.out.println("poll :" + numbers2.poll());
        System.out.println("Updated PriorityQueue: " + numbers2);
        // Creating a priority queue with custom comparator
        PriorityQueue<Integer> numbers3 = new PriorityQueue<>(new CustomComparator());
        numbers3.add(4);
        numbers3.add(2);
        numbers3.add(1);
        numbers3.add(3);
        System.out.println();
        System.out.println("=======================================");
        System.out.println("PriorityQueue using custom comparator: " + numbers3);
        System.out.println("poll :" + numbers3.poll());
        System.out.println("Updated PriorityQueue: " + numbers3);
        System.out.println("poll :" + numbers3.poll());
        System.out.println("Updated PriorityQueue: " + numbers3);
        System.out.println("poll :" + numbers3.poll());
        System.out.println("Updated PriorityQueue: " + numbers3);
        System.out.println("poll :" + numbers3.poll());
        System.out.println("Updated PriorityQueue: " + numbers3);
    }
}

class CustomComparator implements Comparator<Integer> {

    @Override
    public int compare(Integer number1, Integer number2) {
        int value = number1.compareTo(number2);
        // elements are sorted in reverse order
        if (value > 0) {
            return -1;
        } else if (value < 0) {
            return 1;
        } else {
            return 0;
        }
    }
}
