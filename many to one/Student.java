class Student{

public int id;
public String name;
public ClassRoom classRoom;


public Student(int id,String name,ClassRoom classRoom){

this.id=id;
this.name=name;
this.classRoom=classRoom;


}

public void displayStudentDetails(){


System.out.println("id of the Student"+id+","+"name of the Student"+name);
classRoom.displayClassRoom();

}

}