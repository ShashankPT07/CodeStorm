class ClassRoom{


public int numberOfClasses;
public String className;


public ClassRoom(int numberOfClasses,String className){

this.numberOfClasses=numberOfClasses;
this.className=className;

}
public void displayClassRoom(){

System.out.println("Number of class"+numberOfClasses+","+"Name of the Class"+className);


}


}