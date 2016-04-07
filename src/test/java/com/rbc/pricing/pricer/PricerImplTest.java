package com.rbc.pricing.pricer;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.comparesEqualTo;
import static org.mockito.Matchers.any;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.math.BigDecimal;

import org.junit.Test;

import com.rbc.pricing.aggregation.BasketImpl;

public class PricerImplTest {
	
	@Test
	public void basketPriceIsValid() {
		final BigDecimal BASKET_PRICE = new BigDecimal("4.78");
		
		PricerImpl basketPricer = new PricerImpl();
		BasketImpl basket = mock(BasketImpl.class);
		when(basket.getPrice((PricingAlgorithm)any())).thenReturn(BASKET_PRICE);
		
		assertThat(basketPricer.calculatePrice(basket), comparesEqualTo(BASKET_PRICE));
	}

}
