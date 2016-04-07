package com.rbc.pricing.components;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.comparesEqualTo;

import java.math.BigDecimal;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

import com.rbc.pricing.referencedata.ReferenceDataImpl;
import com.rbc.pricing.referencedata.ReferenceDataType;

public class AppleTest {
	
	private static final BigDecimal APPLE_PRICE = new BigDecimal("0.11");

	@Mock ReferenceDataImpl refData;
	
	Apple apple;
	
	@Before
	public void setUp() {
		MockitoAnnotations.initMocks(this);
		
		Mockito.when(refData.getPrice(ReferenceDataType.APPLE)).thenReturn(APPLE_PRICE);
		apple = new Apple(refData);
	}
	
	@Test
	public void costForOneUnitAsExpected() {
		assertThat(apple.getPrice(), comparesEqualTo(APPLE_PRICE));
	}
}
