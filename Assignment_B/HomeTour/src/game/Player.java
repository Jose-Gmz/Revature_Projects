package game;
import fixtures.Room;

public class Player {

	Room currentRoom;
	
	public Room getCurrentRoom() {
		return this.currentRoom;
	}
	
	
	public void setCurrentRoom(Room newRoom) {
		this.currentRoom = newRoom;
		
	}
	
	public Room goCommand(String[] command2 , Player player) {
		
		
		if (currentRoom.getExit(command2[1]).getname().equals("Empty")){
			System.out.println("___________________________\n" + "That is not an exit!" + "\n___________________________");
			return currentRoom;
		}
		
		return player.currentRoom.getExit(command2[1]);

	}
	
}
