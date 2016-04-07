package com.rbc.pricing.referencedata;

import java.math.BigDecimal;

public interface ReferenceData {

	BigDecimal getPrice(ReferenceDataType refDataType);
}
