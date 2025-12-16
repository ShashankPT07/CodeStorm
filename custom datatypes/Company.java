class Company {
    public void displayEmployees(Employee[] employees) {
        for (int in = 0; in < employees.length; in++) {
            Employee emp = employees[in];
            emp.displayInfo();
        }
    }
}