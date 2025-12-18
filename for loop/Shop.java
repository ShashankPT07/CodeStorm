class Shop{

public static void main(String [] args){
	
int []shopId={2,3,4};
String []shopName={"GM","MG","GC"};
long []orderNumbers = {1000L, 2000L, 3000L};
float []productWeights = {1.1f, 2.2f, 3.3f};
double []accountBalances = {1.11, 2.22, 3.33};
char []gradeLetters = {'A', 'B', 'C'};
boolean []isActive = {true, false, true};


	for(int shopid : shopId){
		
		System.out.println(shopid);
	}
	for (String shopname : shopName){
		System.out.println(shopname);
	}
	for(long ordernumbers : orderNumbers){
		System.out.println(ordernumbers);
	}
	for(float productweights:productWeights){
		System.out.println(productweights);
	}
	for(double ac:accountBalances){
		System.out.println(ac);
	}
	for (char gl:gradeLetters){
		System.out.println(gl);
	}
	for(boolean ia:isActive){
		System.out.println(ia);
	}
}
}

