package exercicios;

import java.util.Scanner;

public class exercicio1 {
	
	public static void main(String[] args) {
		
		Scanner ler = new Scanner (System.in);
		
		float salario, abono, novosalario;
		
		System.out.println("Digite o salário: ");
		salario = ler.nextFloat();
		
		System.out.println("Digite o abono: ");
		abono = ler.nextFloat();
		
		novosalario = salario + abono;
		
		System.out.println("Seu novo salário é: "+novosalario);
	}

}
