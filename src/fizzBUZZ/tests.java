package fizzBUZZ;

import static org.junit.Assert.*;

import org.junit.Test;

public class tests {

	@Test
	public void esMultiplo() 
	{
		NumberIsFizzBuzz fizz_o_buzz = new NumberIsFizzBuzz();
		int numerator=8;
		int denominator=2;
		assertTrue(fizz_o_buzz.esMultiplo(numerator, denominator));

	}
	
	@Test
	public void palabraEsFizz() 
	{
		NumberIsFizzBuzz fizz_o_buzz = new NumberIsFizzBuzz();
		int numero=9;
		assertEquals("Fizz",fizz_o_buzz.palabraFizzOBuzz(numero));
	}
	
	@Test
	public void palabraNoEsFizz() 
	{
		NumberIsFizzBuzz fizz_o_buzz = new NumberIsFizzBuzz();
		int numero=8;
		assertEquals("",fizz_o_buzz.palabraFizzOBuzz(numero));
	}
}
