class Teacher {
    public String teacherName;
    public String subject;
    public Student student;

    public Teacher(String teacherName, String subject, Student student) {
        this.teacherName = teacherName;
        this.subject = subject;
        this.student = student;
    }

    public void displayTeachingDetails() {
        System.out.println("Teacher Name: " + teacherName + ", Subject: " + subject);
        System.out.println("Teaching Student: " + student.studentName + ", Student ID: " + student.studentId);
    }
}