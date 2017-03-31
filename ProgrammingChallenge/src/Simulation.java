
public interface Simulation {

	//part of pre: Unoccupied elevator at the floor gets priority
	//part of pre: Closest elevator answers call
	//part of pre: Unless moving elevator is passing that floor
	//part of pre: elevator cannot proceed above top floor or below ground floor
	public boolean callElevatorRequest(int originFloor, int destinationFloor);
	
	//create a queue to keep track of requests
	
}
