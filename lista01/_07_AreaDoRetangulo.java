package lista01;

import java.util.Scanner;

public class _07_AreaDoRetangulo {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite a base do ret�ngulo: ");
		int base = sc.nextInt();
		System.out.println("Digite a altura do ret�ngulo: ");
		int altura = sc.nextInt();
		
		int area = base * altura;
		
		System.out.println("�rea do ret�ngulo: " + area);
		
		sc.close();
	}
}
