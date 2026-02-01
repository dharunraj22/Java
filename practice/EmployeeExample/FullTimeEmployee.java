package practice.EmployeeExample;

public class FullTimeEmployee extends Employee {
    private double bonus;

    public FullTimeEmployee(String id, String name, double baseSalary, double bonus) {
        super(id, name, baseSalary);
        this.bonus = bonus;
    }

    @Override
    public double calculateSalary() {
        System.out.println("In FullTimeEmployee class");
        return super.getBaseSalary() + bonus;
    }
}
