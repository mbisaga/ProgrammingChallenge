
public class ElevatorImpl implements Elevator {

	private boolean isdoorOpen;
	private int numberOfTrips;
	private int numberOfFloorsPassed;
	private boolean isInMaintenanceMode;
	private int currentFloor;
	private boolean isStopped;
	private boolean isGoingUp;
	private boolean isGoingDown;
	
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

	@Override
	public boolean getisDoorOpen() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public int getnumberOfTrips() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int getnumberOfFloorsPassed() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean getisInMaintenanceMode() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public int getcurrentFloor() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean getisStationary() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean getisGoingUp() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean getisGoingDown() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void setisDoorOpen(boolean isDoorOpen) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setnumberOfTrips(int numberOfTrips) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setnumberOfFloorsPassed(int numberOfFloorsPassed) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setisInMaintenanceMode(boolean isInMaintenanceMode) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setcurrentFloor(int currentFloor) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setisStationary(boolean isStationary) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setisGoingUp(boolean isGoingUp) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setisGoingDown(boolean isGoingDown) {
		// TODO Auto-generated method stub
		
	}
	
	
}
