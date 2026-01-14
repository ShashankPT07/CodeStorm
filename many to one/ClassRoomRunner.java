class ClassRoomRunner{

public static void main(String [] ars){


ClassRoom classRoom = new ClassRoom(23,"hero");
Student student = new Student(2,"bro",classRoom);
student.displayStudentDetails();
Assigment assigment = new Assigment(4,"Mths",classRoom);

assigment.displayAssigmentDetails();
}



}