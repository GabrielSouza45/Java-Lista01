package lista01;

import java.util.Scanner;

public class _12_AreaDoCirculo {
	public static void main(String[]args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite a base maior (B): ");
		double B = sc.nextDouble();
		
		System.out.println("Digite a base menor (b): ");
		double b = sc.nextDouble();
		
		System.out.println("Digite a altura (h): ");
		double h = sc.nextDouble();
	
		double area = ((B + b) * h) / 2;
		
		System.out.println("Área do trapézio: " + area);
		
		sc.close();
	}
}
