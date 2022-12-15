package lista01;

import java.util.Scanner;

public class _06_Divisao {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o dividendo: ");
		int numero1 = sc.nextInt();
		System.out.println("Digite o divisor: ");
		int numero2 = sc.nextInt();
		
		int div = numero1 / numero2;
		
		System.out.println("Divisão: " + div);
		
		sc.close();
	}
}
