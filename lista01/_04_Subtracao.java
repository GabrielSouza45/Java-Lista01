package lista01;

import java.util.Scanner;

public class _04_Subtracao {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um valor: ");
		int numero1 = sc.nextInt();
		System.out.println("Digite outro valor: ");
		int numero2 = sc.nextInt();
		
		int subtracao = numero1 - numero2;
		
		System.out.println("Subtração: " + subtracao);
		
		sc.close();
	}
}
