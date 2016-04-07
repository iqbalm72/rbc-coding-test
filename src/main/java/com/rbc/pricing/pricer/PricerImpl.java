package com.rbc.pricing.pricer;

import java.math.BigDecimal;

import com.rbc.pricing.aggregation.Basket;

public class PricerImpl implements Pricer {

	/**
	 * Calculate the total price of the basket
	 * @param basket basket of all items
	 * @return total price
	 */
	@Override
	public BigDecimal calculatePrice(Basket basket) {
		
		return basket.getPrice(new PricingAlgorithm() {
			
								@Override
								public BigDecimal calculatePrice(BigDecimal price) {
									return price;
								}
		});
	}
}
