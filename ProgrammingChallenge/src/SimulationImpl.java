import java.util.ArrayList;


public class SimulationImpl implements Simulation {

	private int numberOfElevators;
	private int numberOfFloors;
	private int topFloor;
	private int groundFloor = 1;
	ArrayList<Elevator> elevators;
	
	public SimulationImpl(int numberOfElevators, int numberOfFloors) {
		this.numberOfElevators = numberOfElevators;
		this.numberOfFloors = numberOfFloors;
		topFloor = numberOfFloors; 
		
		//initializing elevators
		elevators = new ArrayList<Elevator>();
		for (int i = 0; i < numberOfElevators; i++) {
			Elevator e1 = new ElevatorImpl();
			elevators.add(e1);	
		}
	}
	
	
	public boolean callElevatorRequest(int originFloor, int destinationFloor) {
		
	}
	
	private Elevator findClosestElevator() {
		
	}
}
