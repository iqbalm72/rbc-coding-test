package com.rbc.pricing.components;

import com.rbc.pricing.referencedata.ReferenceData;
import com.rbc.pricing.referencedata.ReferenceDataType;

public class Apple extends PurchaseItemImpl {

	public Apple(ReferenceData refData) {
		super(refData, ReferenceDataType.APPLE);
	}
}
