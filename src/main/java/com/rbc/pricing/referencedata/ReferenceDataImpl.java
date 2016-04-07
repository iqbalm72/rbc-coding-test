package com.rbc.pricing.referencedata;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

public class ReferenceDataImpl implements ReferenceData {

	private static final Map<ReferenceDataType, ReferenceItem> database = new HashMap<>();
	
	// Initialise reference database entries
	//
	static {
		database.put(ReferenceDataType.APPLE, new ReferenceItem(new BigDecimal("0.87")));
		database.put(ReferenceDataType.ORANGE, new ReferenceItem(new BigDecimal("0.45")));
		database.put(ReferenceDataType.LEMON, new ReferenceItem(new BigDecimal("0.68")));
		database.put(ReferenceDataType.PEACH, new ReferenceItem(new BigDecimal("0.92")));
		database.put(ReferenceDataType.BANANA, new ReferenceItem(new BigDecimal("0.21")));
	}
	
	public BigDecimal getPrice(ReferenceDataType refDataType) {
		
		 ReferenceItem refItem = database.get(refDataType);
		 if(refItem == null) {
			throw new IllegalArgumentException("Reference datatype " + refDataType.toString() + " not in the database"); 
		 }
		 
		 return refItem.getPrice();
	}

	// Helper class to store reference data in database
	//
	private static class ReferenceItem {
		private final BigDecimal price;

		public ReferenceItem(BigDecimal price) {
			this.price = price;
		}
		
		BigDecimal getPrice() {
			return price;
		}
	}
}
