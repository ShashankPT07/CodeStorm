class Employee {
    private int employeeId;
    private String employeeName;

    public Employee(int employeeId, String employeeName) {
        this.employeeId = employeeId;
        this.employeeName = employeeName;
    }

    public void displayInfo() {
        System.out.println("Employee ID: " + employeeId + ", Employee Name: " + employeeName);
    }
}


