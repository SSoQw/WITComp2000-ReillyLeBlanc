package p1.lab2.comp2000;

public class MotorBoatTest {
    
    public static void main(String[] args) {
        
    	System.out.println("Create a boat: tank capacity = 5, max speed = 55, efficiency = 0.001");
        MotorBoat myBoat = new MotorBoat(5.0, 55.0, 0.001);
        
        System.out.println();
        
        System.out.println("We are trying to travel for 1.0 hour with no fuel.");
        myBoat.operateForTime(1.0);
        System.out.println("Fuel left is " + myBoat.fuelRemaining() 
                           + " and we have gone " + myBoat.distance());
        
        System.out.println();
        
        System.out.println("Trying to add 10 gallons of fuel.");
        System.out.println("But should only be able to hold 5.");
        myBoat.refuelBoat(10.0);
        System.out.println("Fuel left is " + myBoat.fuelRemaining()
                           + " and we have gone " + myBoat.distance());
        
        System.out.println();
        
        System.out.println("We are traveling for 1.0 hour with a speed of 0.");
        myBoat.operateForTime(1.0);
        System.out.println("Fuel left is " + myBoat.fuelRemaining()
                           + " and we have gone " + myBoat.distance());
        
        System.out.println();
        
        System.out.println("Trying to change the speed to 85.");
        System.out.println("Should only be able to go 55.");
        myBoat.changeSpeed(85.0);
        System.out.println("Fuel left is " + myBoat.fuelRemaining()
                           + " and we have gone " + myBoat.distance());
        
        System.out.println();
        
        System.out.println("We are traveling for 1.0 hour with a speed of 55.");
        System.out.println("Should use 3.025 gallons of fuel and travel 55 miles.");
        myBoat.operateForTime(1.0);
        System.out.println("Fuel left is " + myBoat.fuelRemaining()
                           + " and we have gone " + myBoat.distance());
        
        System.out.println();
        
        System.out.println("We are traveling for 2.0 hours with a speed of 45.");
        System.out.println("Should use all 1.975 remaining gallons.  " 
        					+ "The travel time will be 0.9753 and the distance is approximately 43.888 miles");
        myBoat.changeSpeed(45.0);
        myBoat.operateForTime(2.0);
        System.out.println("Fuel left is " + myBoat.fuelRemaining()
                            + " and we have gone " + myBoat.distance());
        
        System.out.println();
    }
    
}



