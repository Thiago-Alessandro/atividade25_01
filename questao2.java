package atividade25_01;

import java.util.Scanner;

public class questao2 {

	static Scanner teclado = new Scanner(System.in);
	
	static float saldo;
	
	public static void main(String[] args) {
		
		int opcao;
		
		do {
			
			System.out.println("\tMENU\n0 - sair\n1 - definir saldo inicial\n2 - depositar\n3 - sacar\n4 - ver saldo");
			opcao = teclado.nextInt();
			
			switch(opcao) {
			
			case 1:
				
				definirSaldoInicial();
				
			break;
			case 2:
				
				depositar();
				
			break;
			case 3:
				
				sacar();
				
			break;
			case 4:
				
				mostrarSaldo();
				
			break;
			
			}
			
		}while(opcao!=0);
		
	}
	
	public static void definirSaldoInicial() {
		
		System.out.println("digite o seu saldo inicial: ");
		saldo = teclado.nextFloat();
		
	}
	
	public static void depositar(){
		
		System.out.println("Digite o valor a depositar: ");
		double deposito = teclado.nextDouble();
		
		saldo += deposito;
	}

	public static void sacar() {
		
		System.out.println("Digite o valor a sacar: ");
		double saque = teclado.nextDouble();
		
		if (saldo >= saque) {
			
			saldo-=saque;
			
		} else {
			
			System.out.println("\nsaldo insuficiente");
			
		}
		
	}
	
	public static void mostrarSaldo() {
		
		System.out.println("\nO seu saldo é de: R$" + saldo);
		
	}
	
}
