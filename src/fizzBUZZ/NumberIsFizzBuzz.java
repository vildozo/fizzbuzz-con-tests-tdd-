package fizzBUZZ;

public class NumberIsFizzBuzz {

	private static final int numeroFizz = 3;
	private static final int numeroBuzz = 5;
	
	public boolean esMultiplo(int numerador, int denominador){
		return (numerador % denominador == 0);
	}
	
	
	public static void main(String[] args)
	{
		for(int numeroContador = 0; numeroContador < 100; numeroContador++)
		{
			if (numeroContador % numeroFizz == 0 && numeroContador % numeroBuzz == 0)
			{
				System.out.println("FizzBuzz");                    
			}
			else 
				if(numeroContador % numeroFizz == 0)
				{
					System.out.println("Fizz");
				}
				else 
					if(numeroContador % numeroBuzz == 0)
					{
						System.out.println("Buzz");
					}
					else
						System.out.println(numeroContador);
        }
    }	
}
