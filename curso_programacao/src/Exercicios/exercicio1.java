package Exercicios;

import java.util.Scanner;

public class exercicio1 {

	public static void main(String[] args) {
		int num1, num2, resultado;
		
		Scanner sc = new Scanner(System.in);
		
		num1 = sc.nextInt();
		num2 = sc.nextInt();
		
		resultado = num1 + num2 ;
		
		System.out.println("Soma = " + resultado);
		
		sc.close();
		

	}

}
