package br.edu.univas.main;

import java.util.Scanner;

public class Questao02 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		double saldo = 0.0;
		int sair = 0;
		
		while(sair == 0) {
			
			System.out.println("Digite seu tipo de conta: \n1 - Receita \n2 - Despesa");
			int tipo = leia.nextInt();
			
			if(tipo == 1) {
				System.out.println("Por favor digite o valor da conta: ");
				float valor = leia.nextFloat();
				saldo += valor;
			}else if(tipo == 2) {
				System.out.println("Por favor digite o valor da conta: ");
				float valor = leia.nextFloat();
				saldo -= valor;
			}else if(tipo == 0) {
				sair++;
			}
			else{
				System.out.println("Código Inválido!!! Por favor digite um número válido!");
			}
		}
		
			String saldoFinal = String.format("%.2f", saldo);
			
			if(saldo >= 0.0) {
				System.out.println("Seu saldo atual é POSITIVO no valor de R$ " + saldoFinal);
			}
			else {
				System.out.println("Seu saldo atual é NEGATIVO no valor de R$ " + saldoFinal);
		}
			leia.close();
	}
}
