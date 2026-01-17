class Company {
    public String companyName;
    public String location;
    public Employee employee;

    public Company(String companyName, String location, Employee employee) {
        this.companyName = companyName;
        this.location = location;
        this.employee = employee;
    }

    public void displayCompanyDetails() {
        System.out.println("Company Name: " + companyName + ", Location: " + location);
        System.out.println("Employee Name: " + employee.employeeName + ", Role: " + employee.employeeRole);
    }
}