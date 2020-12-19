package com.hs.ClientTest;

import com.hs.comp.Vehicle;
import com.hs.factory.VehicleFactory;

public class StrategyDPTest1 {

	public static void main(String[] args) {
		Vehicle vehicle=VehicleFactory.getEngineInstance();
		vehicle.journey("Banglore", "Odisha");

	}

}
