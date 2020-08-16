public class SumAverage {
    publi static void  main(String[] args){
        int sum = 0;
        int[] numbers = {10, 20, 30, 40, 50, 60};
        Double average;

        for(int number : numbers) {
            sum += number;
        }

        average = ((double) sum / (double) numbers.length);

        System.out.println("sum = " + sum);
        System.out.println("average = " + average);
    }
}
