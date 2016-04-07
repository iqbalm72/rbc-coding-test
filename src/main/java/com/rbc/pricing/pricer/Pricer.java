package com.rbc.pricing.pricer;

import java.math.BigDecimal;

import com.rbc.pricing.aggregation.Basket;

public interface Pricer {
	
	BigDecimal calculatePrice(Basket basket);
}
