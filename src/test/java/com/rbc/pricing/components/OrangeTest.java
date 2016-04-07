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

public class OrangeTest {
	
	private static final BigDecimal ORANGE_PRICE = new BigDecimal("0.41");

	@Mock ReferenceDataImpl refData;
	
	Orange orange;
	
	@Before
	public void setUp() {
		MockitoAnnotations.initMocks(this);
		
		Mockito.when(refData.getPrice(ReferenceDataType.ORANGE)).thenReturn(ORANGE_PRICE);
		orange = new Orange(refData);
	}
	
	@Test
	public void costForOneUnitAsExpected() {
		assertThat(orange.getPrice(), comparesEqualTo(ORANGE_PRICE));
	}
}
