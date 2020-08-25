class EmployeeTest {
    public static void main(String[] args) {
        Employee worker = new Employee("goukun");
        Employee boss = new Employee("goukun");

        System.out.println(worker.getName());
        System.out.println(boss.getName());
        System.out.println("worker and boss have smae name: " +  worker.equals(boss));
    }
}

class Employee {
    private String name;

    Employee (String name) {
        this.name = name;
    }

    public boolean equals (Employee other) {
        return this.name.equals(other.name);
    }

    public String getName (){
        return this.name;
    }
}
