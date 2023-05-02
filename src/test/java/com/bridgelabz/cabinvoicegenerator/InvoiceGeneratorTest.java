package com.bridgelabz.cabinvoicegenerator;

import org.junit.Test;
import org.junit.Assert;


public class InvoiceGeneratorTest {
	
	@Test
	public void givenDistanceAndTime() {
		InvoiceGenerator invoiceGenerator = new InvoiceGenerator();
		double distance = 2.0;
		int time = 5;
		double fare = invoiceGenerator.calculateFare(distance, time);
		Assert.assertEquals(25,fare, 0.0);
		
	}
	
	@Test
	public void givenLessDistanceAndTime() {
		InvoiceGenerator invoiceGenerator = new InvoiceGenerator();
		double distance = 0.1;
		int time = 1;
		double fare = invoiceGenerator.calculateFare(distance, time);
		Assert.assertEquals(5,fare, 0.0);
		
	}

}
