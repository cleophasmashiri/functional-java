package com.zamaflow;

import java.util.List;
import java.math.BigDecimal;

public class PriceService {

	public BigDecimal calculate(List<BigDecimal> prices) {
	
		BigDecimal t = BigDecimal.ZERO;
		for (BigDecimal p: prices) {
			if (p.compareTo(BigDecimal.valueOf(20)) > 0) {
				t = t.add(p.multiply(BigDecimal.valueOf(0.9)));
			}
		}
		return t;
	}

	public BigDecimal calculateFunctional(List<BigDecimal> prices) {
		return prices.stream()
		.filter(p -> p.compareTo(BigDecimal.valueOf(20)) > 0)
		.map(p -> p.multiply(BigDecimal.valueOf(0.9)))
		.reduce(BigDecimal.ZERO, BigDecimal::add);
	}

}
