package br.edu.cefsa.ftt.ec;

public class Calc {
	/*
	 * Criar um método que retorna true ou false se
	 * um dado número inteiro positivo é ou não
	 * um número primo!
	 * 
	 */
	
	public boolean PrimeChecker(int numero)
	{
		if (numero < 0)
			return false;
		
		for (int i = 2; i < numero / 2; i++)
			if (numero % i == 0)
				return false;
		
		return true;
	}
}
