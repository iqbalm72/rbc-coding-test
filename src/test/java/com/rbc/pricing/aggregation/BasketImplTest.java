package com.rbc.pricing.aggregation;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.comparesEqualTo;
import static org.hamcrest.Matchers.equalTo;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.math.BigDecimal;

import org.junit.Test;

import com.rbc.pricing.components.Apple;
import com.rbc.pricing.components.Banana;
import com.rbc.pricing.components.Lemon;
import com.rbc.pricing.components.Orange;
import com.rbc.pricing.components.Peach;
import com.rbc.pricing.pricer.PricingAlgorithm;

public class BasketImplTest {

	BasketImpl basket = new BasketImpl();
	
	PricingAlgorithm algorithm = new PricingAlgorithm() {
		
		@Override
		public BigDecimal calculatePrice(BigDecimal price) {
			return price;
		}
	};
	
	@Test
	public void givenEmptyBasketThenSizeAndCostZero() {
		assertThat(basket.size(), equalTo(0));
		assertThat(basket.getPrice(algorithm), comparesEqualTo(new BigDecimal("0")));
	}
	
	@Test
	public void givenOneOfEachItemThenCostIsValid() {
		Orange orange = mock(Orange.class);
		Apple apple = mock(Apple.class);
		Lemon lemon = mock(Lemon.class);
		Peach peach = mock(Peach.class);
		Banana banana = mock(Banana.class);
		
		when(orange.getPrice()).thenReturn(new BigDecimal("0.11"));
		when(apple.getPrice()).thenReturn(new BigDecimal("0.21"));
		when(lemon.getPrice()).thenReturn(new BigDecimal("0.31"));
		when(peach.getPrice()).thenReturn(new BigDecimal("0.41"));
		when(banana.getPrice()).thenReturn(new BigDecimal("0.51"));
		
		basket.addItem(orange);
		basket.addItem(apple);
		basket.addItem(lemon);
		basket.addItem(peach);
		basket.addItem(banana);
		
		assertThat(basket.size(), equalTo(5));
		assertThat(basket.getPrice(algorithm), comparesEqualTo(new BigDecimal("1.55")));
	}
	
	@Test
	public void givenMultipleOfSomeItemsThenCostIsValid() {
		Orange orange1 = mock(Orange.class);
		Apple apple1 = mock(Apple.class);
		Orange orange2 = mock(Orange.class);
		Apple apple2 = mock(Apple.class);
		Orange orange3 = mock(Orange.class);
	
		when(orange1.getPrice()).thenReturn(new BigDecimal("0.11"));
		when(apple1.getPrice()).thenReturn(new BigDecimal("0.21"));
		when(orange2.getPrice()).thenReturn(new BigDecimal("0.11"));
		when(apple2.getPrice()).thenReturn(new BigDecimal("0.21"));
		when(orange3.getPrice()).thenReturn(new BigDecimal("0.11"));
		
		basket.addItem(orange1);
		basket.addItem(apple1);
		basket.addItem(orange2);
		basket.addItem(apple2);
		basket.addItem(orange3);
		
		assertThat(basket.size(), equalTo(5));
		assertThat(basket.getPrice(algorithm), comparesEqualTo(new BigDecimal("0.75")));
	}
}
