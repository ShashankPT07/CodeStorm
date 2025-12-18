class Student{

public static void main(String [] args){
	
int []studentIds={1001, 1002, 1003};
String []studentNames={"Ram","babu","chan"};
long []rollNumbers = {202101L, 202102L, 202103L};
float []gpas = {3.8f, 3.5f, 4.0f};
double []scholarshipAmounts = {1500.00, 1000.00, 2000.00};
char []gradeLetters = {'A', 'B', 'A'};
boolean []isScholarship = {true, false, true};


	for(int studentid : studentIds){
		
		System.out.println(studentid);
	}
	for (String studentname : studentNames){
		System.out.println(studentname);
	}
	for(long rollnumber : rollNumbers){
		System.out.println(rollnumber);
	}
	for(float gpa:gpas){
		System.out.println(gpa);
	}
	for(double sa:scholarshipAmounts){
		System.out.println(sa);
	}
	for (char gl:gradeLetters){
		System.out.println(gl);
	}
	for(boolean isS:isScholarship){
		System.out.println(isS);
	}
}
}