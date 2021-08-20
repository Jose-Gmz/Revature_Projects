package game;

import java.util.Iterator;
import java.util.Scanner;

import fixtures.Room;
import game.RoomManager;
import game.Player;

public class Main {
	
	//global variable
	public static RoomManager admin = new RoomManager();

	public static void main(String[] args) {
		
		//First call to initiate all rooms
	
		admin.init();
		Player player1 = new Player();
		player1.setCurrentRoom( admin.getStartingRoom() );
		
		System.out.println("Welcome to a home tour!" + "\nInstructions: Type in the word 'go' and a compass direction to move around the house! (Ex.'north')"
		+ " \n\n___________________________" );
		printRoom(player1);
		
		String[] tempInput = new String[2];

		
		while(!tempInput.equals("quit")) {
			
			System.out.println("___________________________\n" + "Where would you like to go?" );
			tempInput = collectInput();
			
			if (tempInput[0].equals("quit")) {
				System.out.println("___________________________\n" +"This ends the tour!");
				break;
			}
			
			parse(tempInput, player1);
			} 

		
	
	}
	
	private static void printRoom(Player player) {
		System.out.println("Current room: " + player.getCurrentRoom().getname());
		System.out.println("Long discription: " + player.getCurrentRoom().getLDescription());
		
	}
	
	
	private static String[] collectInput() {
		
		Scanner sc = new Scanner(System.in);
		String commandInput = sc.nextLine();
		String[] splitCommand = commandInput.split(" ");
		
		return splitCommand;
	
	}
	
	private static void parse(String[] command, Player player) {
		
		
		switch(command[0]) {
		case "go":
			
			System.out.println("___________________________\n" +"Go was entered! " + "\n___________________________");
			player.setCurrentRoom(player.goCommand(command, player));
			printRoom(player);
			System.out.println("___________________________");
			
			for(int i = 0; i < player.getCurrentRoom().getExits().length; i++) {
				
				

				if(!player.getCurrentRoom().getExits()[i].getname().equals("Empty")) {
					
					switch(i) {
					case 1 :
						System.out.print("north");
						break;
					case 2:
						System.out.print("west");
						break;
					case 3:
						System.out.print("east");
						break;
					case 0:
						System.out.print("south");
						break;
					}
					
					System.out.println(" exit: " + player.getCurrentRoom().getExits()[i].getname() + " " + player.getCurrentRoom().getExits()[i].getSDescription());
				}
			}
			
			break;
		default:
			System.out.println("Sorry, that's not an option");
			break;
		}
	}
	
	
}
