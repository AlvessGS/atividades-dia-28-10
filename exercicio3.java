package exercicios;

import java.util.Scanner;

public class exercicio3 {
	
	public static void main(String[] args) {
Scanner ler = new Scanner (System.in);
		
		float salarioBruto, noturno, extra, desconto;
		
		System.out.println("Digite o seu salário bruto: ");
		salarioBruto = ler.nextFloat();
		
		System.out.println("Digite o seu adicional noturno: ");
		noturno = ler.nextFloat();
		
		System.out.println("Digite sua hora extra: ");
		extra = ler.nextFloat();
		
		System.out.println("Digite o seu descontos: ");
		desconto = ler.nextFloat();

		
		float salarioLiquido = salarioBruto + noturno + (extra *5) - desconto;
		
		System.out.println("Seu salário liquido é: "+ salarioLiquido);
	}

}
