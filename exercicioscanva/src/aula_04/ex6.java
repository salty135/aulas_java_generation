package aula_04;

import java.util.Scanner;

public class ex6 {

	public static void main(String[] args) {
		  Scanner scanner = new Scanner(System.in);
	        int soma = 0;
	        int contador = 0;
	        int numero;
	        
	        System.out.println("Digite números inteiros (0 para encerrar):");

	        do {
	            System.out.print("Digite um número: ");
	            numero = scanner.nextInt();

	            if (numero != 0 && numero % 3 == 0) {
	                soma += numero;
	                contador++;
	            }
	        } while (numero != 0);

	        if (contador > 0) {
	            double media = (double) soma / contador;
	            System.out.printf("\nA média de todos os números múltiplos de 3 é: %.1f\n", media);
	        } else {
	            System.out.println("\nNenhum número múltiplo de 3 foi digitado.");
	        }
	        
	        scanner.close();

	}

}
