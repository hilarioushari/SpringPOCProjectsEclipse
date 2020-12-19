package com.hs.factory;

import com.hs.comp.DieselEngine;
import com.hs.comp.IEngine;
import com.hs.comp.PetrolEngine;
import com.hs.comp.Vehicle;

public class VehicleFactory {

	public static Vehicle getVehicleInstance(String engineType) {
		IEngine engg = null;
		if(engineType.equalsIgnoreCase("DieselEngine"))
				engg=new DieselEngine();
		else if (engineType.equalsIgnoreCase("PetrolEngine"))
			engg=new PetrolEngine();
		else
			throw new IllegalArgumentException("Invalid Engine Type");
		Vehicle vehicle = new Vehicle();
		vehicle.setEngg(engg);
		return vehicle;
	}
}
