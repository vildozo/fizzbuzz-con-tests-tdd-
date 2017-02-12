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
	public void noEsMultiplo2() 
	{
		assertFalse(claseNumberIsFizzBuzz.esMultiplo(numeroEsFizz,numeroBuzz ));
	}
	
	@Test
	public void palabraEsFizz3() 
	{
		assertEquals("Fizz",claseNumberIsFizzBuzz.calcularFizzOBuzz(numeroEsFizz));
	}
	
	@Test
	public void palabraNoEsFizz4() 
	{
		assertNotEquals("Fizz",claseNumberIsFizzBuzz.calcularFizzOBuzz(numeroNoEsFizzNiBuzz));
		assertNotEquals("Fizz",claseNumberIsFizzBuzz.calcularFizzOBuzz(numeroEsBuzz));
	}
	
	@Test
	public void palabraEsBuzz5() 
	{
		assertEquals("Buzz",claseNumberIsFizzBuzz.calcularFizzOBuzz(numeroEsBuzz));
	}
	
	@Test
	public void palabraNoEsBuzz6() 
	{
		assertNotEquals("Buzz",claseNumberIsFizzBuzz.calcularFizzOBuzz(numeroNoEsFizzNiBuzz));
		assertNotEquals("Buzz",claseNumberIsFizzBuzz.calcularFizzOBuzz(numeroEsFizz));
	}
	
	@Test
	public void palabraEsFizzBuzz7() 
	{
		assertEquals("FizzBuzz",claseNumberIsFizzBuzz.calcularFizzOBuzz(numeroEsFizzBuzz));
	}
	
	
}
