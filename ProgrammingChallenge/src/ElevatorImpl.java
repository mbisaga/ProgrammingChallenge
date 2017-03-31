
public class ElevatorImpl implements Elevator {

	private boolean isdoorOpen;
	private int numberOfTrips;
	private int numberOfFloorsPassed;
	private boolean isInMaintenanceMode;
	private int currentFloor;
	
	public ElevatorImpl(){
		isdoorOpen = false;
		numberOfTrips = 0;
		numberOfFloorsPassed = 0;
		isInMaintenanceMode = false;
		currentFloor = 1;
	}
		
	public void sendFloorReport() {
		// TODO Auto-generated method stub
		
	}
	
	public void sendDoorOpenReport() {
		// TODO Auto-generated method stub
		
	}
	
	public void sendDoorClosedReport() {
		// TODO Auto-generated method stub
		
	}
	
	public boolean isDoorOpen() {
		return isdoorOpen;
	}
	
}
