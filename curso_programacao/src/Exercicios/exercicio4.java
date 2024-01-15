package Exercicios;

import java.util.Locale;
import java.util.Scanner;

public class exercicio4 {

	public static void main(String[] args) {
		
		int func,hsTrab;
		double val, salario;
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		func = sc.nextInt();
		
		
		hsTrab = sc.nextInt();
		val = sc.nextDouble();
		
		salario = hsTrab * val;
		
		System.out.println("Number = " + func);
		System.out.printf("Salary = U$ %.2f%n", salario);
		
		sc.close();
		
	}

}
