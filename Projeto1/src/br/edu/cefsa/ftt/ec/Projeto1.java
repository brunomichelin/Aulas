package br.edu.cefsa.ftt.ec;

import java.util.Scanner;

public class Projeto1 {

	public static void main(String[] args) {
		
		String mensagem = "Vai Corinthians!!";
		System.out.println(mensagem);
		
		Calc c = new Calc();
		
		People p = new People(10, "Maria Silva", 123.45f);
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println(c.PrimeChecker(sc.nextInt()));
		
		
	}

}
