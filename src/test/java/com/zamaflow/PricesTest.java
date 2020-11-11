package com.zamaflow;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class PricesTest {

	private PriceService priceService;

	@Before
	public void setup() {
		this.priceService = new PriceService();
	}

	final List<BigDecimal> prices = Arrays.asList(new BigDecimal(10), new BigDecimal(30), new BigDecimal(17),
			new BigDecimal(20), new BigDecimal(15), new BigDecimal(18), new BigDecimal(45), new BigDecimal(12));

	/**
	 * Rigorous Test :-)
	 */
	@Test
	public void givenListOfPricesShouldCalcuateTotalDiscountedPrice() {
		assertEquals(67.5, this.priceService.calculate(prices).doubleValue(), 0.001);

	}

	@Test
	public void givenListOfPricesShouldCalcuateTotalDiscountedPriceFunctionally() {
		assertEquals(67.5, this.priceService.calculateFunctionally(prices).doubleValue(), 0.001);

	}

}
