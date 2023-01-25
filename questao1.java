package atividade25_01;

import java.util.Scanner;

public class questao1 {

	public static void main(String[] args) {
		
		double distanciaInicial, distanciaPasso, distanciaAChegar;
		
		int passosParaChegar;
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Digite a posicao inicial da pessoa: ");
		distanciaInicial = teclado.nextDouble();
		
		System.out.println("Digite a que distancia a pessoa quer chegar: ");
		distanciaAChegar = teclado.nextDouble();
		
		System.out.println("Digite a distancia do passo dessa pessoa: ");
		distanciaPasso = teclado.nextDouble();
		
		passosParaChegar = calcularPassosParaChegar(distanciaInicial, distanciaPasso, distanciaAChegar);
		
		System.out.println("Será necessário " + passosParaChegar + " passos para alcançar o seu destino");
		
	}
	
	public static int calcularPassosParaChegar (double inicio, double passo, double chegada) {
		
		double passosParaChegar = (chegada - inicio)/passo;
		int passosParaChegarArredondado;
		
		if(passosParaChegar % 2 == 0 || passosParaChegar % 2 == 1) {//p arredondar o numero
			
			passosParaChegarArredondado = (int)passosParaChegar;
			
		} else {
			
			passosParaChegarArredondado = (int)passosParaChegar + 1;
			
		}
		 
		return passosParaChegarArredondado;
		
	}
	
}
