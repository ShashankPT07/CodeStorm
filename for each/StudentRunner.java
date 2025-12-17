class StudentRunner{

public static void main(String [] args){

Collage  collage = new Collage();
Student  student11 = new Student(1,"s");
Student  student1 = new Student(2,"sa");

Student [] studentInfo = {student11,student1};


collage.collageName(studentInfo);


}


}