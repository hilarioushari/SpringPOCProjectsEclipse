package com.hs.clientTest;

import com.hs.comp.Vehicle;
import com.hs.factory.VehicleFactory;

public class ClientTest {

	public static void main(String[] args) {
		try {
			// get vehicle object
			Vehicle vehicle1 = VehicleFactory.getVehicleInstance("DieselEngine");
			vehicle1.journey("Banglore", "Delhi");
			System.out.println("...............................................");
			Vehicle vehicle2 = VehicleFactory.getVehicleInstance("PetrolEngine");
			vehicle2.journey("Banglore", "Odisha");
		} catch (IllegalArgumentException ie) {
			ie.printStackTrace();
		}

	}

}
