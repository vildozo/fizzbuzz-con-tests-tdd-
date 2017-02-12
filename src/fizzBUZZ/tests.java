package fizzBUZZ;

import static org.junit.Assert.*;

import org.junit.Test;

public class tests {
	
	NumberIsFizzBuzz fizz_o_buzz = new NumberIsFizzBuzz();
	
	@Test
	public void esMultiplo1() 
	{
		int numerator=8;
		int denominator=2;
		assertTrue(fizz_o_buzz.esMultiplo(numerator, denominator));

	}
	
	@Test
	public void palabraEsFizz2() 
	{
		int numero=9;
		assertEquals("Fizz",fizz_o_buzz.palabraFizzOBuzz(numero));
	}
	
	@Test
	public void palabraNoEsFizz3() 
	{
		int numero=8;
		assertEquals("",fizz_o_buzz.palabraFizzOBuzz(numero));
	}
	
	@Test
	public void palabraEsBuzz4() 
	{
		int numero=10;
		assertEquals("Buzz",fizz_o_buzz.palabraFizzOBuzz(numero));
	}
	
	@Test
	public void palabraNoEsBuzz5() 
	{
		int numero=11;
		assertEquals("",fizz_o_buzz.palabraFizzOBuzz(numero));
	}
	
	@Test
	public void palabraEsFizzBuzz6() 
	{
		int numero=30;
		assertEquals("FizzBuzz",fizz_o_buzz.palabraFizzOBuzz(numero));
	}
	
	
	
	/*
	@Test
	public void mostrarFizz()
	{
		int numero=4;
		String palabra="";
		fizz_o_buzz.visualizarEnPantalla(numero);
		assertEquals("hello world", SystemOutRule.getLog());
	}*/
	
	
}
