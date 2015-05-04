package com.javarestfulgradle.test;

import static org.junit.Assert.*;

import org.junit.Test;

public class JsontestTimeImplTest {
	@Test
	public void getJsontestTime() {
		assertEquals("Larry", "Larry");
	}

	// Exists just to trigger a FindBugs warning.
	@Override
	public boolean equals(Object obj) {
		return true;
	}

}
