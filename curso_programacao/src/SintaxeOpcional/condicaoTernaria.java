package SintaxeOpcional;

import java.util.Scanner;

public class condicaoTernaria {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double preco = sc.nextDouble();
		//Condição ternária
		double desconto = (preco < 20.0) ? preco * 0.1 : preco  * 0.05;
		
		System.out.println("Valor do desconto: " + desconto);
		
		sc.close();

	}

}
