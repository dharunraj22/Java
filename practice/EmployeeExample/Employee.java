package practice.EmployeeExample;

public class Employee {
    private String id;
    private String name;
    private double baseSalary;

    public Employee(String id, String name, double baseSalary) {
        if (id == null || id.isEmpty()) {
            throw new IllegalArgumentException("Id cannot be null or empty");
        }
        if (name == null || name.isEmpty()) {
            throw new IllegalArgumentException("Name cannot be null or empty");
        }
        if (baseSalary < 0) {
            throw new IllegalArgumentException("Base Salary cannot be negative");
        }
        this.id = id;
        this.name = name;
        this.baseSalary = baseSalary;
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    public double calculateSalary() {
        System.out.println("In Employee class");
        return this.baseSalary;
    }

}
