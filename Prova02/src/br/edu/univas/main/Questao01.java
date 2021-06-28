package br.edu.univas.main;

import java.util.Scanner;

public class Questao01 {
	
	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		//Já que a quantidade de entrevistados é 100 a porcentagem será o mesmo número de pessoas que se encontram na faixa normal!

		int porcentagem = 0;
		for(int i = 1; i <= 100; i++) {
			System.out.println("Digite seu peso atual: ");
			float peso = leia.nextFloat();
			
			System.out.println("Digite sua altura: ");
			float altura = leia.nextFloat();
			
			double imc = peso / (altura * altura);
			
			if(imc >= 18.5 && imc <= 24.9) {
				porcentagem++;
			} else {
				continue;
			}
		}
		System.out.println(porcentagem + "% das pessoas entrevistadas se encontram na faixa considerada 'normal' do IMC.");
		
		leia.close();
	}

}
