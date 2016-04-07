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

public class PeachTest {
	
	private static final BigDecimal PEACH_PRICE = new BigDecimal("0.51");

	@Mock ReferenceDataImpl refData;
	
	Peach peach;
	
	@Before
	public void setUp() {
		MockitoAnnotations.initMocks(this);
		
		Mockito.when(refData.getPrice(ReferenceDataType.PEACH)).thenReturn(PEACH_PRICE);
		peach = new Peach(refData);
	}
	
	@Test
	public void costForOneUnitAsExpected() {
		assertThat(peach.getPrice(), comparesEqualTo(PEACH_PRICE));
	}
}
