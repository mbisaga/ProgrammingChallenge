
public class SimulationImpl implements Simulation {

	private int numberOfElevators;
	private int numberOfFloors;
	private int topFloor;
	private int groundFloor = 1;
	
	public SimulationImpl(int numberOfElevators, int numberOfFloors) {
		this.numberOfElevators = numberOfElevators;
		this.numberOfFloors = numberOfFloors;
		topFloor = numberOfFloors; 
	}
	
	public boolean callElevatorRequest(int originFloor, int destinationFloor) {
		
	}
	
	private int findClosestElevator() {
		
	}
}
