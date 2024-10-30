package exercicios;

import java.util.Scanner;

public class exercicio4 {
	public static void main(String[] args) {
		
		Scanner ler = new Scanner (System.in);
		
		float n1, n2, n3, n4, dife;
		
		System.out.println("Primeiro valor: ");
		n1 = ler.nextFloat();

		System.out.println("Segundo valor: ");
		n2 = ler.nextFloat();

		System.out.println("terceiro valor: ");
		n3 = ler.nextFloat();

		System.out.println("Quarto valor: ");
		n4 = ler.nextFloat();
		
		dife = (n1*n2) - (n3*n4);
		
		System.out.println("Diferença: "+dife);
	}

}
