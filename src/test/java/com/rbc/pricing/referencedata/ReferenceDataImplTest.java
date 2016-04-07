package com.rbc.pricing.referencedata;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.comparesEqualTo;

import java.math.BigDecimal;

import org.junit.Test;

public class ReferenceDataImplTest {

	ReferenceDataImpl refData = new ReferenceDataImpl();
	
	@Test
	public void applePriceIsValid() {
		assertThat(refData.getPrice(ReferenceDataType.APPLE), comparesEqualTo(new BigDecimal("0.87")));
	}
	
	@Test
	public void orangePriceIsValid() {
		assertThat(refData.getPrice(ReferenceDataType.ORANGE), comparesEqualTo(new BigDecimal("0.45")));
	}
	
	@Test
	public void lemonPriceIsValid() {
		assertThat(refData.getPrice(ReferenceDataType.LEMON), comparesEqualTo(new BigDecimal("0.68")));
	}
	
	@Test
	public void peachPriceIsValid() {
		assertThat(refData.getPrice(ReferenceDataType.PEACH), comparesEqualTo(new BigDecimal("0.92")));
	}
	
	@Test
	public void bananaPriceIsValid() {
		assertThat(refData.getPrice(ReferenceDataType.BANANA), comparesEqualTo(new BigDecimal("0.21")));
	}
}
