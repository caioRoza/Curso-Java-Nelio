package Exercicios;

import java.util.Locale;
import java.util.Scanner;

public class exercicio2 {

	public static void main(String[] args) {
		
		double R, A, pi = 3.14159;
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		R = sc.nextDouble();
		
		A = pi * R * R;
		
		System.out.printf("A = %.4f%n" , A);
		
		sc.close();
		

	}

}
