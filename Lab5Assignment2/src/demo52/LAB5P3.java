
package demo52;

public class LAB5P3 {
	public static void main(String[] args){
		RoomPeople roomA = new RoomPeople(); // Create Room A
        RoomPeople roomB = new RoomPeople(); // Create Room B
        
        // Add two to Room A and three to Room B
        for (int i = 0; i < 2; i++) {
            roomA.addOneToRoom(); // Add one person to Room A
        }
        for (int i = 0; i < 3; i++) {
            roomB.addOneToRoom(); // Add one person to Room B
        }
        
        // Print the results
        System.out.println("Room A holds " + roomA.getNumber());
        System.out.println("Room B holds " + roomB.getNumber());
        System.out.println("Total in all rooms is " + RoomPeople.getTotal());
        
        // Remove two from both rooms
        roomA.removeOneFromRoom(); // Remove one from Room A
        roomA.removeOneFromRoom(); // Remove another one from Room A
        roomB.removeOneFromRoom(); // Remove one from Room B
        
        // Print the results
        System.out.println("Room A holds " + roomA.getNumber());
        System.out.println("Room B holds " + roomB.getNumber());
        System.out.println("Total in all rooms is " + RoomPeople.getTotal());
        
        // Try to remove two from Room A (should not change the values)
        roomA.removeOneFromRoom(); // Try to remove one from Room A
        roomA.removeOneFromRoom(); // Try to remove another one from Room A
        
        // Print the final results
        System.out.println("Room A holds " + roomA.getNumber());
        System.out.println("Room B holds " + roomB.getNumber());
        System.out.println("Total in all rooms is " + RoomPeople.getTotal());
    }
		
	}
}

class RoomPeople {
    
	// TODO: write your code here
	private int numberInRoom;
	private static int totalNumber;
	
	public RoomPeople() {
		nummberInRoom = 0;
	}

	
    
    public static int getTotal(){
    	// TODO: write your code here
    	return totalNumber;
    }
    
    
    public void addOneToRoom(){
    	// TODO: write your code here
    	numberInRoom++;
    	totalNumber++;
    }
    
    public void removeOneFromRoom(){
    	// TODO: write your code here
    	if (numberInRoom > 0) { 
            numberInRoom--; 
            totalNumber--; 
        }
    }
    
    public int getNumber(){
    	// TODO: write your code here
        return numberInRoom;
    }
}   
