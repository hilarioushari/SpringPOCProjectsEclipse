package com.hs.ClientTest;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import com.hs.comp.Vehicle;

public class StrategyDPTest1 {

	public static void main(String[] args) {
		
		//Create IOC container
		BeanFactory factory = new XmlBeanFactory(new ClassPathResource("com/hs/cfgs/applicationContext.xml"));
		//get Target class object
		Vehicle vehicle=factory.getBean("vehicle",Vehicle.class);
		//invoke B.method
		vehicle.journey("Banglore", "Odisha");
	}

}
