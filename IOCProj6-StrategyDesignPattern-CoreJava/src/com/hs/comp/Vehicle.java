package com.hs.comp;

public final class Vehicle {

	private IEngine engg=null;
	public void setEngg(IEngine engg) {
		this.engg=engg;
	}
	
	public void journey(String startPlace, String endPlace) {
		engg.start();
		System.out.println("Journey started from ::"+startPlace);
		System.out.println("..............Journey is going on..............");
		System.out.println("Journey started from ::"+endPlace);
		engg.stop();
	}
}
