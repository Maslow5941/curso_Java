package aplicacao;

import java.util.Locale;
import java.util.Scanner;

import entidade.Produto;

public class Programa {

	public static void main(String[] args) {
		
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Produto produto = new Produto();
		
		System.out.println("Digite informacao do produto");
		System.out.println("Nome : ");
		produto.nome = sc.nextLine();
		System.out.println("Preco : ");
		produto.preco = sc.nextDouble();
		System.out.println("Quantidade : ");
		produto.quantidade = sc.nextInt();
		
		
		
		System.out.println(produto);
		System.out.println("Adicionar produto no estoque: ");
		int quantidade = sc.nextInt();
		produto.addProd(quantidade);
		System.out.println("Atualização do produto" + produto);
		System.out.println();
		
		System.out.println("Remover produto do estoque: ");
		quantidade = sc.nextInt();
		produto.removeProd(quantidade);
		
		System.out.println("Atualização do produto" + produto);
		System.out.println();
		
		
		
		sc.close();

	}

}
