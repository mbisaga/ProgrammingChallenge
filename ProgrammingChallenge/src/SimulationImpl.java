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
		
		Elevator e1 = findClosestElevator();
		
		if (originFloor>destinationFloor) { //going down! 
			setIsGoingDown(e1);
			//set destination floor
		}
		if (originFloor<destinationFloor) { //going up!{
			setIsGoingUp(e1);
			//set destination floor
		}
		else {
			setIsStationary(e1);
			//set destination floor
		}
	}

	private Elevator findClosestElevator() {
		//looks at elevators on each floor and returns most optimal one according to requirements
	}
	
	private void setIsGoingDown(Elevator e1) {
		e1.setisGoingDown(true);
		e1.setisGoingUp(false);
		e1.setisStationary(false);
	}
	
	private void setIsGoingUp(Elevator e1) {
		e1.setisGoingDown(false);
		e1.setisGoingUp(true);
		e1.setisStationary(false);
	}
	
	private void setIsStationary(Elevator e1) {
		e1.setisGoingDown(false);
		e1.setisGoingUp(false);
		e1.setisStationary(true);
	}
}
