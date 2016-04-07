package com.rbc.pricing.pricer;

import java.math.BigDecimal;

public interface PricingAlgorithm {

	BigDecimal calculatePrice(BigDecimal price);

}
