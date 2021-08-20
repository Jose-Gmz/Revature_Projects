package game;

import fixtures.Room;

public class RoomManager {
	
	Room startingRoom;
	
	Room[] rooms = new Room[6];
	
	public Room[] livingRoomExits = new Room[4];
	public Room[] kitchenExits = new Room[4];
	public Room[] bathroomExits = new Room[4];
	public Room[] bedRoomExits = new Room[4];
	public Room[] denExits = new Room[4];
	public Room[] patioExits = new Room[4];
	
	
	public Room getStartingRoom() {
		return this.startingRoom;
	}
	

	
	public void init() {
		
		
	// Starting room
	Room livingRoom = new Room("Living room",": A living space ",
			"This room is spacious and has plenty of space for guests and family to relax. \nThe front entrance of the house is on the south wall of the room and has 2 long windows on opposite sides of the door. \nThe west wall has a large mounted tv with a wooden entertainment center underneath.\nA large gray sectional is in the center of the room and speakers are placed in the corners of the room ceiling.");
	
	this.rooms[0] = livingRoom;
	this.startingRoom = livingRoom;
	
	// Rest of the rooms
	Room kitchen = new Room("Kitchen",": A beutiful kitchen ",
			"You enter the room from the west, exiting the living room. \nThe north and east walls are covered with white cabinets and steel kitchen appliances. \nThe countertops have a spice rack and a drying rack next to the sink. \nA large family table is in the center and has plenty of chairs surrounding. \nThe floor is covered in tile.");
	this.rooms[1] = kitchen;
	
	Room bathroom = new Room("Bathroom",": A compact bathroom ",
			"The bathroom is a neat and clean space with white tile on the floor and a small window above the toilet on the east wall. \nThe shower has a sliding glass door and a patterned bath mat on the floor. \nThe bathroom cabinet placed above the sink has a mirror and underneath the sink are extra storage cabinets. \nThe door is on the west wall.");
	this.rooms[2] = bathroom;
	
	Room bedRoom = new Room("Bedroom",": A spacious bedroom",
			"Entering from the den, you can see a King sized bed that is placed in the middle of the room covered with dark blue sheets. \nNext to the bed is a black bedside table with an alarm clock, and a tabletop lamp. \nThe main source of lighting comes from a large window that covers the west wall of the room. \nThe closet is placed on the east wall and alongside a large mirror.");
	this.rooms[3] = bedRoom;
	
	
	Room den = new Room("Den",": A relaxing area",
			"This small and compartmentalized room has the north wall covered in wooden wall paneling and a painting affixed above a fireplace. \nThe south wall has a door that leads to the living room and a built-in bookshelf that holds books, as well as Vinyl records. \nThe room has a leather studded sofa and two armchairs. \nA rectangular coffee table is placed on top of an antique rug in the center of the room. \nThe west wall has a door leading to the patio.");
	this.rooms[4] = den;
	
	Room patio = new Room("Patio",": Perfect for fresh air!",
			"A small outdoor space where you can get fresh air. \nThe space is decorated with plants and a raised garden. \nThe patio furniture includes a few chairs covered with pillows and a table. \nThe area is paved with concrete and it is attached to the rest of the home.");
	this.rooms[5] = patio;
	
	Room nullRoom = new Room("Empty","Empty","Empty");
	
	//setting room for living Room
	this.livingRoomExits[0] = nullRoom;
	this.livingRoomExits[1] = den;
	this.livingRoomExits[2] = nullRoom;
	this.livingRoomExits[3] = kitchen;
	
	//setting room for kitchen
	this.kitchenExits[0] = nullRoom;
	this.kitchenExits[1] = nullRoom;
	this.kitchenExits[2] = livingRoom;
	this.kitchenExits[3] = nullRoom;

	
	//setting room for den
	this.denExits[0] = livingRoom;
	this.denExits[1] = bedRoom;
	this.denExits[2] = patio;
	this.denExits[3] = bathroom;
	
	//setting room for bedroom
	
	this.bedRoomExits[0] = den;
	this.bedRoomExits[1] = nullRoom;
	this.bedRoomExits[2] = nullRoom;
	this.bedRoomExits[3] = nullRoom;
	
	//setting room for bath room
	
	this.bathroomExits[0] = nullRoom;
	this.bathroomExits[1] = nullRoom;
	this.bathroomExits[2] = den;
	this.bathroomExits[3] = nullRoom;
	
	//setting room for patio room
	
	this.patioExits[0] = nullRoom;
	this.patioExits[1] = nullRoom;
	this.patioExits[2] = nullRoom;
	this.patioExits[3] = den;
	
	//passing to setExits.
	livingRoom.setExit(livingRoomExits);
	kitchen.setExit(kitchenExits);
	den.setExit(denExits);
	bedRoom.setExit(bedRoomExits);
	bathroom.setExit(bathroomExits);
	patio.setExit(patioExits);
		
	
	}
	
	
	

}
