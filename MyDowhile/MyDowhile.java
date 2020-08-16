import java.util.Scanner;

public class MyDowhile {
    public static void main(String[] args) {
        Double number, sum = 0.0;

        Scanner input = new Scanner(System.in);

        do {
            System.out.print("Enter a number: ");
            number = input.nextDouble();
            sum += number;
        } while (number != 0.0);

        input.close();
        System.out.println("sum = " + sum);
    }
}
