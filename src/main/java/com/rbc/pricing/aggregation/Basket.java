package com.rbc.pricing.aggregation;

import java.math.BigDecimal;

import com.rbc.pricing.components.PurchaseItem;
import com.rbc.pricing.pricer.PricingAlgorithm;

public interface Basket {

	int size();
	boolean addItem(PurchaseItem item);
	BigDecimal getPrice(PricingAlgorithm algorithm);
}
