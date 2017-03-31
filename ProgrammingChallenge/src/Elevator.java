
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
	public boolean getisStationary();
	public boolean getisGoingUp();
	public boolean getisGoingDown();
	
	public void setisDoorOpen(boolean isDoorOpen);
	public void setnumberOfTrips(int numberOfTrips);
	public void setnumberOfFloorsPassed(int numberOfFloorsPassed);
	public void setisInMaintenanceMode(boolean isInMaintenanceMode);
	public void setcurrentFloor(int currentFloor);
	public void setisStationary(boolean isStationary);
	public void setisGoingUp(boolean isGoingUp);
	public void setisGoingDown(boolean isGoingDown);
	
	
}
