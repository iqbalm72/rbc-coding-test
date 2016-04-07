package com.rbc.pricing.components;

import com.rbc.pricing.referencedata.ReferenceData;
import com.rbc.pricing.referencedata.ReferenceDataType;

public class Lemon extends PurchaseItemImpl {

	public Lemon(ReferenceData refData) {
		super(refData, ReferenceDataType.LEMON);
	}
}
