class Car{

public static void main(String [] args){
	
int []carIds={101, 102, 103};
String []carNames={"Ford","Honda","BMW"};
long []engineNumbers = {12345L, 67890L, 11223L};
float []prices = {25000.50f, 32000.75f, 55000.99f};
double []weights = {1.5, 1.3, 1.8};
char []ratings = {'A', 'B', 'A'};
boolean []isNew = {true, false, true};


	for(int carid : carIds){
		
		System.out.println(carid);
	}
	for (String carname : carNames){
		System.out.println(carname);
	}
	for(long enginenumbers : engineNumbers){
		System.out.println(enginenumbers);
	}
	for(float carprice:prices){
		System.out.println(carprice);
	}
	for(double carweight:weights){
		System.out.println(carweight);
	}
	for (char carrating:ratings){
		System.out.println(carrating);
	}
	for(boolean isitnew:isNew){
		System.out.println(isitnew);
	}
}
}