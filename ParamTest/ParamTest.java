public class ParamTest {
    public static void main(String[] args) {
        // Test 1: modify value
        int x = 5000;
        System.out.println("x before: " + x);
        tribleValue(x);
        System.out.println("x after: " + x);


        // Test 2: modify object by reference
        Employee tony = new Employee("Tony", 5000);
        System.out.println("Tony salary before:" + tony.getSalary());
        tribleSalary(tony);
        System.out.println("Tony salary after:" + tony.getSalary());


        // Test 3: swap object reference
        Employee bob = new Employee("Bob", 1000);
        Employee alice = new Employee("Alice", 1000);
        System.out.println("bob name before: " + bob.getName());
        System.out.println("alice name before: " + alice.getName());
        swap(bob, alice);
        System.out.println("bob name after: " + bob.getName());
        System.out.println("alice name after: " + alice.getName());
    }

    public static void tribleValue(int x) {
        x = x * 3;
    }

    public static void tribleSalary(Employee worker) {
        worker.raiseSalary(200);
    }

    public static void swap(Employee x, Employee y){
        Employee temp = x;
        x = y;
        y = temp;
    }

}
