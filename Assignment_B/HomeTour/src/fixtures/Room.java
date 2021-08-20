package fixtures;

public class Room extends Fixture{
	
	Room [] exits;

	public Room(String name, String shortDescription, String longDescription) {
		super(name, shortDescription, longDescription);
		
		this.exits = new Room[4];
	}
	
	public Room[] getExits() {
		
		return exits;	
	}

	
	public Room getExit(String direction) {
		
		
		
		switch(direction) {
		case "north":
			return this.exits[1];
			
			
		case "south":
			return this.exits[0];
			
			
		case "west":
			return this.exits[2];
			
			
		case "east":
			return this.exits[3];
		}
		
		return null;
	}
	
	public void setExit(Room[] roomsExits) {
		
		this.exits = roomsExits;
	
		
	}

	
}
