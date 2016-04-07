package com.rbc.pricing.driver;

import java.math.BigDecimal;

import com.rbc.pricing.aggregation.Basket;
import com.rbc.pricing.aggregation.BasketImpl;
import com.rbc.pricing.components.Apple;
import com.rbc.pricing.components.Banana;
import com.rbc.pricing.components.Lemon;
import com.rbc.pricing.components.Orange;
import com.rbc.pricing.components.Peach;
import com.rbc.pricing.pricer.Pricer;
import com.rbc.pricing.pricer.PricerImpl;
import com.rbc.pricing.referencedata.ReferenceData;
import com.rbc.pricing.referencedata.ReferenceDataImpl;

public class RunPricer {

	public static void main(String[] args) {
		
		Pricer pricer = new PricerImpl();
		Basket basket = new BasketImpl();
		ReferenceData refData = new ReferenceDataImpl();
		
		basket.addItem(new Apple(refData));
		basket.addItem(new Orange(refData));
		basket.addItem(new Lemon(refData));
		basket.addItem(new Peach(refData));
		basket.addItem(new Banana(refData));
		
		BigDecimal totalPrice = pricer.calculatePrice(basket);
		
		System.out.println("Total Price: " + totalPrice.toString());
	}
}
