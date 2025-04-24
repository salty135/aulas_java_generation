package aula_03;

import java.util.Scanner;

public class ex5 {

	public static void main(String[] args) {
		  Scanner scanner = new Scanner(System.in);
	        
	        System.out.print("Código do Produto: ");
	        int codigo = scanner.nextInt();
	        
	        // Solicitar e ler a quantidade
	        System.out.print("Quantidade: ");
	        int quantidade = scanner.nextInt();
	        
	        String produto = "";
	        double precoUnitario = 0;
	        double valorTotal = 0;
	        
	        switch (codigo) {
	            case 1:
	                produto = "Cachorro Quente";
	                precoUnitario = 10.00;
	                break;
	            case 2:
	                produto = "X-Salada";
	                precoUnitario = 15.00;
	                break;
	            case 3:
	                produto = "X-Bacon";
	                precoUnitario = 18.00;
	                break;
	            case 4:
	                produto = "Bauru";
	                precoUnitario = 12.00;
	                break;
	            case 5:
	                produto = "Refrigerante";
	                precoUnitario = 8.00;
	                break;
	            case 6:
	                produto = "Suco de laranja";
	                precoUnitario = 13.00;
	                break;
	            default:
	                System.out.println("Código inválido!");
	                return; 
	        }
	        
	       // Calcular o valor total
	        valorTotal = quantidade * precoUnitario;
	        
	        // Exibir os resultados
	        System.out.println("Produto: " + produto);
	        System.out.printf("Valor total: R$ %.2f\n", valorTotal);
	        
	        scanner.close();
	}

}
