package br.edu.univas.main;

import java.util.Scanner;

public class Questao03 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);

		int contadorDeNotas = 1;
		int aprovados = 0;
		int recuperacao = 0;
		int dependencia = 0;
		
		for(int i = 0; i < 50; i++) {
			System.out.println("Digite a " + contadorDeNotas + "º nota: ");
			int nota = leia.nextInt();
			
			if(nota >= 60) {
				aprovados++;
			}else if(nota >= 30) {
				recuperacao++;
			}else {
				dependencia++;
			}
			contadorDeNotas++;
		}
		
		float porcentagemAprovados = (aprovados * 100) / 50;
		float porcentagemRecuperacao = (recuperacao * 100) / 50;
		float porcentagemDependencia= (dependencia * 100) / 50;
		
		System.out.println(aprovados + " alunos APROVADOS que correponde à " + porcentagemAprovados + "% da turma.");
		System.out.println(recuperacao + " alunos em RECUPERAÇÃO que correponde à " + porcentagemRecuperacao + "% da turma.");
		System.out.println(dependencia + " alunos em DEPENDÊNCIA que correponde à " + porcentagemDependencia + "% da turma.");
		
		leia.close();
	}
}
