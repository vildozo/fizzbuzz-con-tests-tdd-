package fizzBUZZ;

import static org.junit.Assert.*;

import org.junit.Test;

public class tests {

	@Test
	public void esMultiplo() 
	{
		Program progra = new Program();
		int numerator=8;
		int denominator=2;
		assertTrue(progra.esMultiplo(numerator, denominator));

	}

}
