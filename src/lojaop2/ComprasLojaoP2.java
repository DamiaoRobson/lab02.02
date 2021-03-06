package lojaop2;

/**
 * @author Damiao Robson Mat:116210003
 */

import java.util.Scanner;

public class ComprasLojaoP2 {
	
	private static double preco = 1.99;
	
	public static void mudarPreco(double preco2){
		preco = preco2;
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Bem vindo ao Lojão LP2!\nDigite a quantidade de produtos diferentes que será comprada: ");
		int qtdItens = sc.nextInt();
		sc.nextLine();

		// Variaveis
		String[] nomeProduto = new String[qtdItens];
		int[] qtdProduto = new int[qtdItens];
		int totalItens = 0;

		for (int i = 0; i < qtdItens; i++) {
			System.out.print(String.format("Nome do Produto %d: ", i + 1));
			nomeProduto[i] = sc.nextLine();
			System.out.print(String.format("Quantidade de %s: ", nomeProduto[i]));
			qtdProduto[i] = sc.nextInt();
			sc.nextLine();
			totalItens += qtdProduto[i];
		}

		System.out.println("-- Cadastro Concluído --\nA sua compra foi:");

		for (int i = 0; i < qtdItens; i++) {
			System.out.println(
					String.format("%d %s (%d%%)", qtdProduto[i], nomeProduto[i], (qtdProduto[i] * 100) / totalItens));
		}

		System.out.println("Total de produtos: " + totalItens);
		System.out.println(String.format("Total gasto: R$ %.2f\n-- Fim da execução --", totalItens * preco));
		
		sc.close();
	}

}
