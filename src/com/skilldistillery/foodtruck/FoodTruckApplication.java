package com.skilldistillery.foodtruck;

import java.util.Scanner;

public class FoodTruckApplication {

	Scanner kb = new Scanner(System.in);

	int MAX_TRUCKS = 5;
	FoodTruck[] truckFleet = new FoodTruck[MAX_TRUCKS];

	public static void main(String[] args) {
		// TODO FoodTruck array to store up to 5 food trucks
		// When created, constructor assigns a unique ID
		// while loop for creation that stops with "QUIT"
		System.out.println("Hello! Welcome to the customized Food Truck Application!");

		FoodTruckApplication trucks = new FoodTruckApplication();
		trucks.createTrucks();
		System.out.println("continue program");

	}

	public void createTrucks() {
		for (int truckID = 0; truckID < truckFleet.length; truckID++) {
			System.out.println("Please enter the Food Truck Name: ");
			String name = kb.next();
			if (name.equalsIgnoreCase("quit")) {
				break;
//					displayTrucks();
			}
			System.out.println("Please enter the Food Truck type of cuisine: ");
			String foodType = kb.next();
			System.out.println("Please enter the Food Truck rating (1-5): ");
			int rating = kb.nextInt();

			FoodTruck truck = new FoodTruck(name, foodType, rating);
			truckFleet[truckID] = truck;
		}

		displayTrucks();
	}

	public void displayTrucks() {
//		display the array of food trucks that was created in the for loop createTrucks() method
		for (FoodTruck foodTruck : truckFleet) {
			if (foodTruck != (null)) {
				System.out.println(foodTruck.toString());
			}
		}

	}
}
