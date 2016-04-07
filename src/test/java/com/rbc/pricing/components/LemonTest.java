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

public class LemonTest {
	
	private static final BigDecimal LEMON_PRICE = new BigDecimal("0.31");

	@Mock ReferenceDataImpl refData;
	
	Lemon lemon;
	
	@Before
	public void setUp() {
		MockitoAnnotations.initMocks(this);
		
		Mockito.when(refData.getPrice(ReferenceDataType.LEMON)).thenReturn(LEMON_PRICE);
		lemon = new Lemon(refData);
	}
	
	@Test
	public void costForOneUnitAsExpected() {
		assertThat(lemon.getPrice(), comparesEqualTo(LEMON_PRICE));
	}
}
