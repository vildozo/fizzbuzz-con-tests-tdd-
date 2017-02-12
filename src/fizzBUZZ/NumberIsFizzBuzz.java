package fizzBUZZ;

public class NumberIsFizzBuzz {
	private static final int numeroFizz = 3;
	private static final int numeroBuzz = 5;
	private static final String palabraFizz= "Fizz";
	private static final String palabraBuzz= "Buzz";
	
	public static boolean esMultiplo(int numerador, int denominador){
		return (numerador % denominador == 0);
	}
	
	public static String calcularFizzOBuzz(int numero){	
		String palabra="";
		if (esMultiplo(numero,numeroFizz))
			palabra = palabraFizz;
		if (esMultiplo(numero,numeroBuzz))
			palabra = palabra+palabraBuzz;
		if (palabra == "")
			palabra = numero + "";
		return palabra;	
	}
	
	public static void visualizarEnPantalla(int numero)	{
		String palabra=calcularFizzOBuzz(numero);
		System.out.println(palabra);
	}
	
	public static void main(String[] args)	{
		for(int numeroContador = 0; numeroContador < 100; numeroContador++)
		{
			visualizarEnPantalla(numeroContador);
        }
    }	
}
