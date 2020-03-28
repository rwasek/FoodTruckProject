package com.skilldistillery.foodtruck;


public class FoodTruck {
	
	
//	private int numTrucks;
//    private FoodTruck[] trucks; 
//    private static int MAX_TRUCKS = 5;
//    public FoodTruck() {
//        trucks = new FoodTruck[MAX_TRUCKS];
//    }
	
	
	
	private String truckName;
	private String truckFoodType;
	private int truckRating;
	private static int uniqueID = 0;


public FoodTruck(String name, String foodType, int rating) {
	truckName = name;
	truckFoodType = foodType;
	truckRating = rating;
	uniqueID++;
}

public String toString() {
	return "Food Truck " + truckName + " food type: " + truckFoodType  
			+ " food truck rating: " + truckRating + " food truck Unique ID: " + uniqueID;
	
}

public void displayTrucks() {
	String display = toString();
	System.out.println(display);
}

}
	

