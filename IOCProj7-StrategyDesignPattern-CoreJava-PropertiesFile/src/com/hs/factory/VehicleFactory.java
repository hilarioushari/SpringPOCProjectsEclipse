package com.hs.factory;

import java.io.FileInputStream;
import java.io.InputStream;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.Properties;

import com.hs.comp.IEngine;
import com.hs.comp.Vehicle;

public class VehicleFactory {

	private static Properties prop;
	
	static {
		try {
			//Load the property file by using IOStreams
			InputStream is= new FileInputStream("src/com/hs/commons/strategyDP.properties");
			//Load property file info into java.util.Properties class object
			prop= new Properties();
			prop.load(is);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static Vehicle getEngineInstance() {
		Vehicle vehicle = null;
		try {
			//Load and create dependent class object by collecting data from the property file
			String dependentClassName=prop.getProperty("dependent.className");
			Class dependentClass=Class.forName(dependentClassName);
			Constructor cons[] = dependentClass.getDeclaredConstructors();
			IEngine engg=(IEngine) cons[0].newInstance();
			
			//Create object of target class
			vehicle=new Vehicle();
			//assign dependent class object to target class
			vehicle.setEngg(engg);
		}
		catch(ClassNotFoundException cfe) {
			cfe.printStackTrace();
			
		} catch (InstantiationException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			
			e.printStackTrace();
		} catch (IllegalArgumentException e) {
			
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			
			e.printStackTrace();
		}
		
		return vehicle;
	}
	
}
