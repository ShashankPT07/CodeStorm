public class CompanyRunner {
    public static void main(String[] args) {
        Company company = new Company();

        Employee emp1 = new Employee(101, "Ma");
        Employee emp2 = new Employee(102, "Bob");
        Employee emp3 = new Employee(103, "Mahesh");
        Employee emp4 = new Employee(104, "sudeep");

        Employee[] employees = {emp1, emp2, emp3, emp4};

        company.displayEmployees(employees);
    }
}