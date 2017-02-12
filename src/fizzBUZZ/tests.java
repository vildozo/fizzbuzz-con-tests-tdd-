package fizzBUZZ;

import static org.junit.Assert.*;

import org.junit.Test;

public class tests {
	
	NumberIsFizzBuzz claseNumberIsFizzBuzz = new NumberIsFizzBuzz();
	private static final int numeroFizz = 3;
	private static final int numeroBuzz = 5;
	private static final int numeroEsFizz = 6;
	private static final int numeroEsBuzz = 50;
	private static final int numeroNoEsFizzNiBuzz = 7;
	private static final int numeroEsFizzBuzz = 30;
	
	@Test
	public void esMultiplo1() 
	{
		assertTrue(claseNumberIsFizzBuzz.esMultiplo(numeroEsFizz, numeroFizz));
	}
	
	@Test
	public void noEsMultiplo1() 
	{
		assertFalse(claseNumberIsFizzBuzz.esMultiplo(numeroEsFizz,numeroBuzz ));
	}
	
	@Test
	public void palabraEsFizz2() 
	{
		assertEquals("Fizz",claseNumberIsFizzBuzz.palabraFizzOBuzz(numeroEsFizz));
	}
	
	@Test
	public void palabraNoEsFizz3() 
	{
		assertNotEquals("Fizz",claseNumberIsFizzBuzz.palabraFizzOBuzz(numeroNoEsFizzNiBuzz));
		assertNotEquals("Fizz",claseNumberIsFizzBuzz.palabraFizzOBuzz(numeroEsBuzz));
	}
	
	@Test
	public void palabraEsBuzz4() 
	{
		assertEquals("Buzz",claseNumberIsFizzBuzz.palabraFizzOBuzz(numeroEsBuzz));
	}
	
	@Test
	public void palabraNoEsBuzz5() 
	{
		assertNotEquals("Buzz",claseNumberIsFizzBuzz.palabraFizzOBuzz(numeroNoEsFizzNiBuzz));
		assertNotEquals("Buzz",claseNumberIsFizzBuzz.palabraFizzOBuzz(numeroEsFizz));
	}
	
	@Test
	public void palabraEsFizzBuzz6() 
	{
		assertEquals("FizzBuzz",claseNumberIsFizzBuzz.palabraFizzOBuzz(numeroEsFizzBuzz));
	}
	
	
}
