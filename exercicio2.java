package exercicios;

import java.util.Scanner;

public class exercicio2 {
	
	public static void main(String[] args) {
float n1, n2, n3, n4, media;
		
		Scanner ler = new Scanner (System.in);
		
		System.out.println("DIgite a primeira nota: ");
		n1 = ler.nextFloat();
		
		System.out.println("DIgite a segunda nota: ");
		n2 = ler.nextFloat();
		
		System.out.println("DIgite a terceira nota: ");
		n3 = ler.nextFloat();
		
		System.out.println("DIgite a quarta nota: ");
		n4 = ler.nextFloat();
		
		media = (n1+n2+n3+n4)/4;
		
		System.out.println("Sua média é: "+media);
	}

}
