package lista01;

import java.util.Scanner;

public class _09_AreaDoQuadrado {
	public static void main (String[]args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o lado do quadrado: ");
		int lado = sc.nextInt();
		
		double  area = Math.pow(lado, 2);
		
		System.out.println("�rea do quadrado: " + area);
		
		sc.close();
	}
}
