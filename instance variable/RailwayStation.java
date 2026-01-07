class RailwayStation{

public int noOfPlatforms=6;

public void platforms(){

BusStation busStation = new BusStation();
busStation.buses();
System.out.println("Platforms Numbers"+noOfPlatforms);

}
}