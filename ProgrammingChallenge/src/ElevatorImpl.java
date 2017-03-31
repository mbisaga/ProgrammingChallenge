
public class ElevatorImpl implements Elevator {

	private boolean isDoorOpen;
	private int numberOfTrips;
	private int numberOfFloorsPassed;
	private boolean isInMaintenanceMode;
	private int currentFloor;
	private boolean isStationary;
	private boolean isGoingUp;
	private boolean isGoingDown;
	
	public ElevatorImpl(){
		isDoorOpen = false;
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

	@Override
	public boolean getisDoorOpen() {
		return isDoorOpen;
	}

	@Override
	public int getnumberOfTrips() {
		return numberOfTrips;
	}

	@Override
	public int getnumberOfFloorsPassed() {
		return numberOfFloorsPassed;
	}

	@Override
	public boolean getisInMaintenanceMode() {
		return isInMaintenanceMode;
	}

	@Override
	public int getcurrentFloor() {
		return currentFloor;
	}

	@Override
	public boolean getisStationary() {
		return isStationary;
	}

	@Override
	public boolean getisGoingUp() {
		return isGoingUp;
	}

	@Override
	public boolean getisGoingDown() {
		return isGoingDown;
	}

	@Override
	public void setisDoorOpen(boolean isDoorOpen) {
		this.isDoorOpen = isDoorOpen;
	}

	@Override
	public void setnumberOfTrips(int numberOfTrips) {
		this.numberOfTrips = numberOfTrips;
	}

	@Override
	public void setnumberOfFloorsPassed(int numberOfFloorsPassed) {
		this.numberOfFloorsPassed = numberOfFloorsPassed;
	}

	@Override
	public void setisInMaintenanceMode(boolean isInMaintenanceMode) {
		this.isInMaintenanceMode = isInMaintenanceMode;
	}

	@Override
	public void setcurrentFloor(int currentFloor) {
		this.currentFloor = currentFloor;
	}

	@Override
	public void setisStationary(boolean isStationary) {
		this.isStationary = isStationary;
	}

	@Override
	public void setisGoingUp(boolean isGoingUp) {
		this.isGoingUp = isGoingUp;
	}

	@Override
	public void setisGoingDown(boolean isGoingDown) {
		this.isGoingDown = isGoingDown;
	}
	
	
}
