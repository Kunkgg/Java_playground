/**
 * Employee
 */
public class Employee {
    private String name;
    private double salary;

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public String getName() {
        return this.name;
    }

    public double getSalary() {
        return this.salary;
    }

    public void raiseSalary(double percent) {
        this.salary = this.salary * (1 + percent / 100);
    }

    public static void main(String[] args) {
        Employee Bob = new Employee("Bob", 5000);
        System.out.println("name: " + Bob.getName());
        System.out.println("Salary before: " + Bob.getSalary());
        Bob.raiseSalary(100);
        System.out.println("Salary after: " + Bob.getSalary());
    }
}
