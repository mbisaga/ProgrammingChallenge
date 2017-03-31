
public interface Elevator {

//	//Prints onto console what floor it is on as it is moving
//	//pre: floor>=1 && floor<=topFloor
//	public void sendFloorReport();
//	
//	public void sendDoorOpenReport();
//	
//	public void sendDoorClosedReport();
	
	public boolean getisDoorOpen();
	public int getnumberOfTrips();
	public int getnumberOfFloorsPassed();
	public boolean getisInMaintenanceMode();
	public int getcurrentFloor();
	
	public boolean setisDoorOpen();
	public int setnumberOfTrips();
	public int setnumberOfFloorsPassed();
	public boolean setisInMaintenanceMode();
	public int setcurrentFloor();
	
	
}
