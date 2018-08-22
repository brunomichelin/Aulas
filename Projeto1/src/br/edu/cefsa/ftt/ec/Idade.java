package br.edu.cefsa.ftt.ec;

import java.util.Scanner;

public class Idade {

	//IO: Linha de comando...
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Dica: sout + Ctrl + " "
		System.out.println("Idade...");
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Informe seu ano de nascimento: ");
		
		try {
			System.out.println("Sua idade é: " + (2018 - scanner.nextInt()));
		} catch (Exception e) {
			System.out.println("Ops!!");
			e.printStackTrace();
			System.out.println(e.getMessage());
			
		}

		scanner.close();
		
	}

}


