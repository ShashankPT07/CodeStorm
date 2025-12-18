class Movie{

public static void main(String [] args){
	
int []movieIds={1, 2, 3};
String []movieTitles={"Inception","Matrix","Interstellar"};
long []ticketNumbers = {98765L, 54321L, 10987L};
float []ratings = {8.8f, 8.7f, 8.6f};
double []boxOffice = {828.3, 465.3, 677.5};
char []genres = {'S', 'A', 'S'};
boolean []is3D = {true, false, true};


	for(int movieid : movieIds){
		
		System.out.println(movieid);
	}
	for (String movietitle : movieTitles){
		System.out.println(movietitle);
	}
	for(long ticketnumber : ticketNumbers){
		System.out.println(ticketnumber);
	}
	for(float rating:ratings){
		System.out.println(rating);
	}
	for(double bo:boxOffice){
		System.out.println(bo);
	}
	for (char genre:genres){
		System.out.println(genre);
	}
	for(boolean threeD:is3D){
		System.out.println(threeD);
	}
}
}