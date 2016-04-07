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

public class BananaTest {
	
	private static final BigDecimal BANANA_PRICE = new BigDecimal("0.21");

	@Mock ReferenceDataImpl refData;
	
	Banana banana;
	
	@Before
	public void setUp() {
		MockitoAnnotations.initMocks(this);
		
		Mockito.when(refData.getPrice(ReferenceDataType.BANANA)).thenReturn(BANANA_PRICE);
		banana = new Banana(refData);
	}
	
	@Test
	public void costForOneUnitAsExpected() {
		assertThat(banana.getPrice(), comparesEqualTo(BANANA_PRICE));
	}
}
