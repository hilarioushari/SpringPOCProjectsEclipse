package com.hs.carfactory;

import com.hs.comp.BudgetCar;
import com.hs.comp.ICar;
import com.hs.comp.LuxoryCar;
import com.hs.comp.SportsCar;

public class CarFactory {

		public static ICar getCarInstance(String carType) {
			ICar icar=null;
			if (carType.equalsIgnoreCase("Sports"))
				icar= new SportsCar();
			else if (carType.equalsIgnoreCase("Luxory"))
				icar= new LuxoryCar();
			else if (carType.equalsIgnoreCase("Budget"))
				icar= new BudgetCar();
			else 
				throw new IllegalArgumentException("Invalid Car Type");
			
			return icar;
		}
}
