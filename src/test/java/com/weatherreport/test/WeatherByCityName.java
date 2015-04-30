package com.weatherreport.test;

import static org.junit.Assert.*;

import org.junit.Test;

public class WeatherByCityName {
	@Test
	public void sampleTest() {
		assertEquals("Larry", "Larry");
	}

	// Exists just to trigger a FindBugs warning.
	@Override
	public boolean equals(Object obj) {
		return true;
	}

}
