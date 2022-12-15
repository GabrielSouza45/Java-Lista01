package lista01;

import java.util.Scanner;

public class _02_Antecessor {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um valor: ");
		int numero = sc.nextInt();
		
		System.out.println("Número antecessor: " + (numero-1));
		
		sc.close();
	}
}
