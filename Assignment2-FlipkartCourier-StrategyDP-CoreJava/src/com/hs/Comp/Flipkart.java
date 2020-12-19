package com.hs.Comp;

public class Flipkart {
	
	private ICourier courier;
	String[] itemArr=new String[4];
	
	public void setCourierServiece(ICourier courier) {
		this.courier=courier;
	}
	
	public String[] items() {
		itemArr[0]="Nike Shoe";
		itemArr[1]="Titan Watch";
		itemArr[2]="Jeans";
		itemArr[3]="Levie's Shirt";
		System.out.println("SHOPPING ITEMS : "+itemArr[0]+" "+itemArr[1]+" "+itemArr[2]+" "+itemArr[3]);
		return itemArr;
		
	}
	
	public void shoppingItemDelivery(String address, String[] items) {
		System.out.println("shopping Items dispatched for delivery");
		courier.itemDelivery();
		System.out.println("shopping Items delivered at the delivery address - "+address);
	}



}
