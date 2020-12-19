package com.hs.CourierFactory;

import com.hs.Comp.BlueDartCourier;
import com.hs.Comp.DTDCCourier;
import com.hs.Comp.EkartCourier;
import com.hs.Comp.Flipkart;
import com.hs.Comp.ICourier;

public class CourierFactory {

	String[] itemArr=new String[3];
	
	public static Flipkart getCourierTypeInstance(String courierType) {
		ICourier icourier=  null;
		if (courierType.equalsIgnoreCase("DTDCCourier"))
			icourier=new DTDCCourier();
		else if (courierType.equalsIgnoreCase("EkartCourier"))
			icourier=new EkartCourier();
		else if (courierType.equalsIgnoreCase("BlueDartCourier"))
			icourier=new BlueDartCourier();
		else 
			throw new IllegalArgumentException("Invalid Courier Type");
		//Create target class object
		Flipkart fpkrt = new Flipkart();
		//Assign dependent class object to target class object
		fpkrt.setCourierServiece(icourier);
		return fpkrt;
	}
	
	
}
