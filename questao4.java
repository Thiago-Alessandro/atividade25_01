package atividade25_01;

import java.util.Scanner;

public class questao4 {

	public static void main(String[] args) {
		
		double nota;
		char classificacao;
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Insira a nota do aluno: ");
		nota = teclado.nextDouble();
		
		classificacao = classificarNota(nota);
		
		System.out.println("A classificacao da sua nota é: " + classificacao);
		
	}

	public static char classificarNota(double nota){
		  
		char classificacao;
		
		if (nota >= 9) {
			
			classificacao = 'A';
			
		}else if (nota >= 8) {
			
			classificacao = 'B';
			
		}else if (nota >= 7) {
			
			classificacao = 'C';
			
		}else if(nota >= 6) {
			
			classificacao = 'D';
			
		}else {
			
			classificacao = 'E';
		}
		return classificacao;
	}
	
}
