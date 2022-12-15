package lista01;

import java.util.Scanner;

public class _10_AreaDoLosango {
	public static void main (String[]args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite a diagonal maior (D): ");
		int D = sc.nextInt();
		
		System.out.println("Digite a diagonal menor (d): ");
		int d = sc.nextInt();
		
		double area = D * d / 2;
		
		System.out.println("Área do losango: " + area);
		
		sc.close();
	}
}
