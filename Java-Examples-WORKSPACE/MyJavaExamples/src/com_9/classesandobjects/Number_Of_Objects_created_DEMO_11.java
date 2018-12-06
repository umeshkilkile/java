package com_9.classesandobjects;

public class Number_Of_Objects_created_DEMO_11 {
	private int cadence;
    private int gear;
    private int speed;
    private int id;
    private static int numberOfBicycles = 0; // Static fields or class variables. Common to all objects
        
    public Number_Of_Objects_created_DEMO_11(int startCadence, int startSpeed, int startGear){
        gear = startGear;
        cadence = startCadence;
        speed = startSpeed;

        // increment number of Bicycles
        // and assign ID number
        id = ++numberOfBicycles;
    }
    
    public Number_Of_Objects_created_DEMO_11() {
		id = ++numberOfBicycles;
	}

    // new method to return the ID instance variable
    public int getID() {
        return id;
    }
    
    public static void main(String[] args) {
		Number_Of_Objects_created_DEMO_11 created_11 = new Number_Of_Objects_created_DEMO_11(10, 20, 30);
		System.out.println("Number of objects created : " + created_11.id);
		
		Number_Of_Objects_created_DEMO_11 created_12 = new Number_Of_Objects_created_DEMO_11(10, 20, 30);
		System.out.println("Number of objects created : " + created_12.id);
		
		Number_Of_Objects_created_DEMO_11 created_13 = new Number_Of_Objects_created_DEMO_11(10, 20, 30);
		System.out.println("Number of objects created : " + created_13.id);
		
		Number_Of_Objects_created_DEMO_11 created_14 = new Number_Of_Objects_created_DEMO_11(10, 20, 30);
		Number_Of_Objects_created_DEMO_11 created_15 = new Number_Of_Objects_created_DEMO_11(10, 20, 30);
		Number_Of_Objects_created_DEMO_11 created_16 = new Number_Of_Objects_created_DEMO_11(10, 20, 30);
		
		System.out.println("Number of objects created : " + created_16.id);
		
		Number_Of_Objects_created_DEMO_11 created_112 = new Number_Of_Objects_created_DEMO_11();
		System.out.println(created_112.id);
	}
}
