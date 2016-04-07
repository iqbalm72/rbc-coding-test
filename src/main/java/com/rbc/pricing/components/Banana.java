package com.rbc.pricing.components;

import com.rbc.pricing.referencedata.ReferenceData;
import com.rbc.pricing.referencedata.ReferenceDataType;

public class Banana extends PurchaseItemImpl {

	public Banana(ReferenceData refData) {
		super(refData, ReferenceDataType.BANANA);
	}
}
