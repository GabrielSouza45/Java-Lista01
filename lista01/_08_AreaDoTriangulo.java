package lista01;

import java.util.Scanner;

public class _08_AreaDoTriangulo {
	public static void main (String[]args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite a base do tri�ngulo: ");
		int base = sc.nextInt();
		System.out.println("Digite a altura do tri�ngulo: ");
		int altura = sc.nextInt();
		
		int area = base * altura / 2;
		
		System.out.println("�rea do tri�ngulo: " + area);
		
		sc.close();
	}
}
