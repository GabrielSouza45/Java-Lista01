package lista01;

import java.util.Scanner;

public class _07_AreaDoRetangulo {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite a base do retângulo: ");
		int base = sc.nextInt();
		System.out.println("Digite a altura do retângulo: ");
		int altura = sc.nextInt();
		
		int area = base * altura;
		
		System.out.println("Área do retângulo: " + area);
		
		sc.close();
	}
}
