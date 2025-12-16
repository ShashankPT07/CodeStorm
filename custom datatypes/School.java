class School {
    public int schoolId;
    public String schoolName;

    public School(int schoolId, String schoolName) {
        this.schoolId = schoolId;
        this.schoolName = schoolName;
    }

    public void displayInfo() {
        System.out.println("School ID: " + schoolId + ", School Name: " + schoolName);
    }
}

