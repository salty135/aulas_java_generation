package aula_05;

import java.util.Scanner;

public class ex1 {

	public static void main(String[] args) {
		   Scanner scanner = new Scanner(System.in);

	        int[] vetor = {2, 5, 1, 3, 4, 9, 7, 8, 10, 6};

	        System.out.print("vetor ");
	        for (int i = 0; i < vetor.length; i++) {
	            System.out.print(i + "  ");
	        }
	        System.out.println();
	        
	        System.out.print("     ");
	        for (int num : vetor) {
	            System.out.print(num + "  ");
	        }
	        System.out.println("\n");

	        System.out.print("Digite o número que você deseja encontrar: ");
	        int numeroProcurado = scanner.nextInt();
	        
	        int posicao = -1; 
	        for (int i = 0; i < vetor.length; i++) {
	            if (vetor[i] == numeroProcurado) {
	                posicao = i;
	                break; 
	            }
	        }

	        if (posicao != -1) {
	            System.out.println("O número " + numeroProcurado + " está localizado na posição: " + posicao);
	        } else {
	            System.out.println("O número " + numeroProcurado + " não foi encontrado!");
	        }
	        
	        scanner.close();

	}

}
