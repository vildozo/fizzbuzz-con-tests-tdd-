package fizzBUZZ;

public class NumberIsFizzBuzz {

	private static final int numeroFizz = 3;
	private static final int numeroBuzz = 5;
	private static final String palabraFizz= "Fizz";
	private static final String palabraBuzz= "Buzz";
	
	public static boolean esMultiplo(int numerador, int denominador){
		return (numerador % denominador == 0);
	}
	

	
	public static void main(String[] args)
	{
		for(int numeroContador = 0; numeroContador < 100; numeroContador++)
		{
			if (esMultiplo(numeroContador, numeroFizz) && esMultiplo(numeroContador, numeroBuzz))
			{
				System.out.println("FizzBuzz");                    
			}
			else 
				if(esMultiplo(numeroContador, numeroFizz))
				{
					System.out.println("Fizz");
				}
				else 
					if(esMultiplo(numeroContador, numeroBuzz))
					{
						System.out.println("Buzz");
					}
					else
						System.out.println(numeroContador);
        }
    }	
}
