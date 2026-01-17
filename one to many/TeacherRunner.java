class TeacherRunner {
    public static void main(String[] args) {
     
        Student student = new Student(" Johnson", 101);
     
        Teacher teacher = new Teacher("Ms.", "Mathematics", student);
      
        teacher.displayTeachingDetails();
    }
}