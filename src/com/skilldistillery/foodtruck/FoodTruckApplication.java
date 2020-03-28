package com.skilldistillery.foodtruck;

import java.util.Scanner;

public class FoodTruckApplication {

	public static void main(String[] args) {
		// TODO FoodTruck array to store up to 5 food trucks
		// When created, constructor assigns a unique ID
		// while loop for creation that stops with "QUIT"
		System.out.println("Hello! Welcome to the customized Food Truck Application!");
		Scanner kb = new Scanner(System.in);

		int MAX_TRUCKS = 5;
		FoodTruck[] truckFleet = new FoodTruck[MAX_TRUCKS];

		for (int i = 0; i < truckFleet.length; i++) {

			System.out.println("Please enter the Food Truck Name: ");
			String name = kb.next();
			System.out.println("Please enter the Food Truck type of cuisine: ");
			String foodType = kb.next();
			System.out.println("Please enter the Food Truck rating (1-5): ");
			int rating = kb.nextInt();

			FoodTruck truck = new FoodTruck(name, foodType, rating);
			truckFleet[0] = truck;

			truck.displayTrucks();
		}

		kb.close();

	}
}
