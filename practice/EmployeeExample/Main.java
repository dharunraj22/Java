package practice.EmployeeExample;

public class Main {
    public static void main(String[] args) {
        Employee e = new Employee("e1", "Emp1", 200);
        FullTimeEmployee fte = new FullTimeEmployee("e2", "Emp2", 200, 50);
        ContractEmployee ce = new ContractEmployee("e3", "Emp3", 100);

        Employee[] empArray = {e, fte, ce};
        for (Employee emp : empArray) {
            emp.calculateSalary();
        }
    }
}
