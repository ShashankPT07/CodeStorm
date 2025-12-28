class Person extends Doctor{

public int age;
public String personName;
public char gender;
public float height;
public double weight;
public boolean isMarried;
public long phoneNumber; 

public  Person(int age,String personName,char gender,float height,double weight,boolean isMarried,long phoneNumber){
	super.age=age;
	this.age=age;
	super.personName=personName;
	this.personName=personName;
	super.gender=gender;
	this.gender=gender;
	super.height=height;
	this.height=height;
	super.weight=weight;
	this.weight=weight;
	super.isMarried=isMarried;
	this.isMarried=isMarried;
	super.phoneNumber=phoneNumber;
	this.phoneNumber=phoneNumber;
	System.out.println(age);
	System.out.println(personName);
	System.out.println(gender);
	System.out.println(height);
	System.out.println(weight);
	System.out.println(isMarried);
	System.out.println(phoneNumber);
		
}
public void displayDoctorDetails(){
System.out.println(super.age);
System.out.println(this.age);
System.out.println(super.personName);
System.out.println(this.personName);
System.out.println(super.gender);
System.out.println(this.gender);
System.out.println(super.height);
System.out.println(this.height);
System.out.println(super.weight);
System.out.println(this.weight);
System.out.println(super.isMarried);
System.out.println(this.isMarried);
System.out.println(super.phoneNumber);
System.out.println(this.phoneNumber);		
}



}