package com.rbc.pricing.components;

import java.math.BigDecimal;

import com.rbc.pricing.referencedata.ReferenceData;
import com.rbc.pricing.referencedata.ReferenceDataType;

public abstract class PurchaseItemImpl implements PurchaseItem {

	private final BigDecimal price;
	
	public PurchaseItemImpl(ReferenceData refData, ReferenceDataType refDataType) {
		price = refData.getPrice(refDataType);
	}
	
	@Override
	public BigDecimal getPrice() {
		return price;
	}
}
