
public interface Simulation {

	//part of pre: Unoccupied elevator at the floor gets priority
	//part of pre: Closest elevator answers call
	//part of pre: Unless moving elevator is passing that floor
	//part of pre: elevator cannot proceed above top floor or below ground floor
	//post: returns true if successful, otherwise false
	public boolean callElevatorRequest(int originFloor, int destinationFloor);
	
	//create a queue to keep track of requests
	
}
