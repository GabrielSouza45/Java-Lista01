package lista01;

import java.util.Scanner;

public class _08_AreaDoTriangulo {
	public static void main (String[]args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite a base do triângulo: ");
		int base = sc.nextInt();
		System.out.println("Digite a altura do triângulo: ");
		int altura = sc.nextInt();
		
		int area = base * altura / 2;
		
		System.out.println("Área do triângulo: " + area);
		
		sc.close();
	}
}
