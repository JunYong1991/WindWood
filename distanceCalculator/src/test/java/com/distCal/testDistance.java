package com.distCal;

import static org.assertj.core.api.Assertions.assertThat;

import java.math.BigDecimal;
import java.math.RoundingMode;

import org.junit.jupiter.api.Test;


public class testDistance {
	
	@Test
	public void testCreateUser() {
		double length = 3;
		double length2 = 5;
		String unit = "Yards";
		String unit2 = "Meters";
		
		boolean result = unit.toLowerCase().contains("y");
		boolean result2 = unit2.toLowerCase().contains("y");

		if (result) {
			length = length * 0.9144;
		}
		
		if (result2) {
			length2 = length2 * 0.9144;
		}
		
		double totalLength = length + length2;
		
		BigDecimal bd = new BigDecimal(totalLength).setScale(2, RoundingMode.HALF_UP);  
		double newNum = bd.doubleValue();  
		System.out.println("Total Length : "+newNum+" Meters");
		
	}
}
