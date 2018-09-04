package com.in28minutes.tests;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestsWithParameters {

	@Parameters("browser")
	@Test
	public void runWithMultipleBrowsers(String browser) {
		System.out.println("Running with " + browser);
	}
	
}
