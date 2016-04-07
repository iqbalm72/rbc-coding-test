package com.rbc.pricing.aggregation;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import com.rbc.pricing.components.PurchaseItem;
import com.rbc.pricing.pricer.PricingAlgorithm;

public class BasketImpl implements Basket {

	private final List<PurchaseItem> purchaseItems = new ArrayList<>();

	@Override
	public int size() {
		return purchaseItems.size();
	}

	@Override
	public boolean addItem(PurchaseItem purchaseItem) {
		return purchaseItems.add(purchaseItem);
	}

	/**
	 * Loop through all items in basket and calculate total price.  The algorithm passed in allows
	 * the caller to determine what the calculation methodology should be.  For example could apply
	 * a 10% discount by passing in an algorithm that does that.
	 * 
	 *   @param algorithm the price calculation algorithm
	 *   @return total price of all items
	 */
	@Override
	public BigDecimal getPrice(PricingAlgorithm algorithm) {
		
		BigDecimal price = new BigDecimal("0");
		for(PurchaseItem purchaseItem: purchaseItems) {
			BigDecimal itemPrice = algorithm.calculatePrice(purchaseItem.getPrice());
			price = price.add(itemPrice);
		}
		
		return price;
	}
	
}
