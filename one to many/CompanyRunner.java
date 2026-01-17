class CompanyRunner {
    public static void main(String[] args) {
   
        Employee employee = new Employee(" Smith", "Software Engineer");
 
        Company company = new Company("Tech Solutions Inc.", "New York", employee);

        company.displayCompanyDetails();
    }
}