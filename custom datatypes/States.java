class States{
public int statesId;
public String statesName;

public States(int statesId,String statesName){

this.statesId= statesId;
this.statesName= statesName;

}
public void totalPeoples(){

System.out.println("number of peoples"+statesId+","+statesName);
}


}