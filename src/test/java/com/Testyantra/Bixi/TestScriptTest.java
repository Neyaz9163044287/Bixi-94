package com.Testyantra.Bixi;

import org.testng.annotations.Test;

public class TestScriptTest 
{
	@Test(groups = "smoke")
	public void ts3Test()
	{
		System.out.println("--TestScript3--");
	}
	
	@Test(groups = "regression")
	public void ts4Test()
	{
		System.out.println("--TestScript4--");
	}
}
