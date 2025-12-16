class CountryRunner{


public static void main(String [] args){


Country country = new Country();

States state1 = new States(1,"india");
States state2 = new States(2,"aus");
States state3 = new States(3,"eng");
States state4 = new States(4,"sa");
States[] state ={state1,state2,state3,state4};

country.countryName(state);


}

}