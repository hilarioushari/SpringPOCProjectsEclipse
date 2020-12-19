package com.hs.ClientTest;

import com.hs.Comp.Flipkart;
import com.hs.CourierFactory.CourierFactory;

public class FlipkartClientTest {

	public static void main(String[] args) {
		Flipkart fpkart= CourierFactory.getCourierTypeInstance("DTDCCOurier");
		fpkart.shoppingItemDelivery("Banglore", fpkart.items());
		

	}

}
