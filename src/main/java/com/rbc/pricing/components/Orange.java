package com.rbc.pricing.components;

import com.rbc.pricing.referencedata.ReferenceData;
import com.rbc.pricing.referencedata.ReferenceDataType;

public class Orange extends PurchaseItemImpl {

	public Orange(ReferenceData refData) {
		super(refData, ReferenceDataType.ORANGE);
	}
}
