package com.hs.Test;

import com.hs.carfactory.CarFactory;
import com.hs.comp.ICar;

public class CarTest {

	public static void main(String[] args) {
		ICar icar = CarFactory.getCarInstance("Sports");
		icar.drive();
		icar.addAccessories();
	}

}
