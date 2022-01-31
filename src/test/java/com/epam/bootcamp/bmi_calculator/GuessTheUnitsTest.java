package com.epam.bootcamp.bmi_calculator;

import static org.junit.Assert.*;

import org.junit.*;

public class GuessTheUnitsTest {
	
	@Test
	public void GuessTheUnitsTest1() throws Exception{
		GuessTheUnits gtu = new GuessTheUnits(1.7,50.0);
		assertEquals(gtu.getUnitType(),"metric");
	}
	
	@Test
	public void GuessTheUnitsTest2() throws Exception{
		GuessTheUnits gtu = new GuessTheUnits(170,50.0);
		assertEquals(gtu.getUnitType(),"metric");
	}
	
	@Test
	public void GuessTheUnitsTest3() throws Exception{
		GuessTheUnits gtu = new GuessTheUnits(5.58,1764);
		assertEquals(gtu.getUnitType(),"US");
		assertEquals(gtu.getWeight(),110,1);
	}
	
	@Test
	public void GuessTheUnitsTest4() throws Exception{
		try{
			GuessTheUnits gtu = new GuessTheUnits(170,1764);
			assertEquals(gtu.getUnitType(),"US");
		}catch(Exception e){
			assertEquals(e.getMessage(),"Height and weight is in different metric.");
		}
	}

	//After mutation tests

	/*
	Fixed changed boundary:
	line 39: height == 100
	line 58: weight == 1000
	 */
	@Test
	public void Height100Weight1000() throws Exception{
		GuessTheUnits gtu = new GuessTheUnits(100, 1000);
		assertEquals(gtu.getUnitType(), "metric");
	}


}