package atividade25_01;

import java.util.Scanner;

public class Fatura {

	private static String numero = new String();
	public static String descricao = new String();
	public static int quantidade;
	public static double preco;
	
	public Fatura(String numeroProduto, String descricaoProduto, int quantidadeComprada, double preco) {
		
		this.setNumero(numeroProduto);
		descricao = descricaoProduto;
		setQuantidade(quantidadeComprada);
		setPreco(preco);
		
	}
	
	static Scanner teclado = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		String numero1 = new String();//criando as variaveis mas com "1" no final para nao ficar ambiguo
		String descricao1 = new String();
		int quantidade1;
		double preco1;
		
		System.out.println("Insira ai: ");
		numero1 = teclado.next();
				System.out.println("Insira ai: ");
		descricao1 = teclado.next();
				System.out.println("Insira ai: ");
		quantidade1 = teclado.nextInt();
				System.out.println("Insira ai: ");
		preco1 = teclado.nextDouble();
		
			Fatura produto1 = new Fatura(numero1, descricao1, quantidade1, preco1);
			 
			System.out.println(produto1.getNumero());
			System.out.println(produto1.descricao);
			System.out.println(produto1.getQuantidade());
			System.out.println(produto1.getPreco());
			
			System.out.println("Insira ai: ");
			numero1 = teclado.next();
					System.out.println("Insira ai: ");
			descricao1 = teclado.next();
					System.out.println("Insira ai: ");
			quantidade1 = teclado.nextInt();
					System.out.println("Insira ai: ");
			preco1 = teclado.nextDouble();
			
			Fatura produto2 = new Fatura(numero1, descricao1, quantidade1, preco1);
			
			System.out.println(produto1.getNumero());
			System.out.println(produto1.descricao);
			System.out.println(produto1.getQuantidade());
			System.out.println(produto1.getPreco());
			
			System.out.println(produto2.getNumero());
			System.out.println(produto2.descricao);
			System.out.println(produto2.getQuantidade());
			System.out.println(produto2.getPreco());
			
			System.out.println("Insira ai: ");
			numero1 = teclado.next();
					System.out.println("Insira ai: ");
			descricao1 = teclado.next();
					System.out.println("Insira ai: ");
			quantidade1 = teclado.nextInt();
					System.out.println("Insira ai: ");
			preco1 = teclado.nextDouble();
			
			Fatura produto3 = new Fatura(numero1, descricao1, quantidade1, preco1);
			
			System.out.println(produto1.getNumero());
			System.out.println(produto1.descricao);
			System.out.println(produto1.getQuantidade());
			System.out.println(produto1.getPreco());
			
			System.out.println(produto2.getNumero());
			System.out.println(produto2.getQuantidade());
			System.out.println(produto2.getQuantidade());
			System.out.println(produto2.getPreco());

			System.out.println(produto3.getNumero());
			System.out.println(produto3.getDescricao());
			System.out.println(produto3.getQuantidade());
			System.out.println(produto3.getPreco());
			
			Fatura produto4 = new Fatura(numero1, descricao1, quantidade1, preco1);
			
			Fatura produto5 = new Fatura(numero1, descricao1, quantidade1, preco1);
			
			
			
		
	}
	 public String getNumero() {
	        return numero;
	    }

	    public void setNumero(String nome) {
	        this.numero = nome;
	    }

	    public String getDescricao() {
	    	return descricao;
	    }
	    
	    public void setQuantidade() {
	    	this.descricao = descricao;
	    }
	    
	    public double getPreco() {
	        return preco;
	    }

	    public void setPreco(double preco) {
	        if(preco < 0) {
	            this.preco = 0;
	        } else {
	            this.preco = preco;
	        }
	    }

	    public int getQuantidade() {
	        return quantidade;
	    }

	    public void setQuantidade(int quantidade) {
	        if(quantidade < 0) {
	            this.quantidade = 0;
	        } else {
	            this.quantidade = quantidade;
	        }
	    }

}
