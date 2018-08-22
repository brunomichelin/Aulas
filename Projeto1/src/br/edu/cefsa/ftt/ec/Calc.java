package br.edu.cefsa.ftt.ec;

public class Calc {
	/*
	 * Criar um m�todo que retorna true ou false se
	 * um dado n�mero inteiro positivo � ou n�o
	 * um n�mero primo!
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
