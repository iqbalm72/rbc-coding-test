package com.rbc.pricing.components;

import com.rbc.pricing.referencedata.ReferenceData;
import com.rbc.pricing.referencedata.ReferenceDataType;

public class Peach extends PurchaseItemImpl {

	public Peach(ReferenceData refData) {
		super(refData, ReferenceDataType.PEACH);
	}
}
