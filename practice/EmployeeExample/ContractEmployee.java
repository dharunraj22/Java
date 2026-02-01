package practice.EmployeeExample;

public class ContractEmployee extends Employee{
    
    public ContractEmployee(String id, String name, double basicSalary) {
        super(id, name, basicSalary);
    }

    @Override
    public double calculateSalary() {
        System.out.println("In ContractEmployee class");
        return super.getBaseSalary() * 0.8;
    }

}
