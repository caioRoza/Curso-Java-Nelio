package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Pessoa;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantas pessoas serao digitadas? ");
		
		int n = sc.nextInt();
		Pessoa[] vect = new Pessoa[n];
		
		for (int i = 0; i < vect.length; i++) {
			sc.nextLine();
			System.out.println("Dados da " + (i+1) + "a pessoa:");
			String name = sc.nextLine();
			int age = sc.nextInt();
			double heigth = sc.nextDouble();
			vect[i] = new Pessoa(name, age, heigth);			
		}
		
		double soma = 0.0;
		for (int i=0; i<vect.length; i++) {
			soma = soma + vect[i].getHeigth();
		}
		double medHeigth = soma / n;
		
		System.out.println();
		System.out.printf("Altura media: %.2f%n", medHeigth);
		
		int cont = 0;
		for (int i=0; i<vect.length; i++) {
			if(vect[i].getAge() < 16) {
				cont = cont + 1;
			}
		}
		
		double percent = cont * 100.0 / n;
		
		System.out.printf("Pessoas com menos de 16 anos: %.1f%%%n", percent);
		
		for (int i = 0; i < vect.length; i++) {
			if(vect[i].getAge()<16) {
				System.out.println(vect[i].getName());
			}
		}
		
		sc.close();

	}

}
